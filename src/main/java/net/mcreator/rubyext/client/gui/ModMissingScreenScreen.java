package net.mcreator.rubyext.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.rubyext.world.inventory.ModMissingScreenMenu;
import net.mcreator.rubyext.network.ModMissingScreenButtonMessage;
import net.mcreator.rubyext.init.RubyextModScreens;
import net.mcreator.rubyext.RubyextMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class ModMissingScreenScreen extends AbstractContainerScreen<ModMissingScreenMenu> implements RubyextModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_okay;

	public ModMissingScreenScreen(ModMissingScreenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 240;
		this.imageHeight = 142;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.rubyext.mod_missing_screen.label_warninglabel1"), 101, 13, -65536, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.rubyext.mod_missing_screen.label_warninglabel2"), 20, 31, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.rubyext.mod_missing_screen.label_warninglabel3"), 20, 47, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.rubyext.mod_missing_screen.label_warninglabel4"), 20, 63, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.rubyext.mod_missing_screen.label_warninglabel5"), 32, 79, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.rubyext.mod_missing_screen.label_warninglabel6"), 64, 95, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_okay = Button.builder(Component.translatable("gui.rubyext.mod_missing_screen.button_okay"), e -> {
			int x = ModMissingScreenScreen.this.x;
			int y = ModMissingScreenScreen.this.y;
			if (true) {
				RubyextMod.PACKET_HANDLER.sendToServer(new ModMissingScreenButtonMessage(0, x, y, z));
				ModMissingScreenButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 96, this.topPos + 112, 46, 20).build();
		this.addRenderableWidget(button_okay);
	}
}