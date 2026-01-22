/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubyext.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.rubyext.RubyextMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RubyextModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RubyextMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(RubyextModBlocks.WATER_LILY.get().asItem());
			tabData.accept(RubyextModBlocks.FLAMEWOOD_LEAVES.get().asItem());
			tabData.accept(RubyextModBlocks.TEA_LEAVES.get().asItem());
			tabData.accept(RubyextModBlocks.FLAME_INFUSED_LILY.get().asItem());
			tabData.accept(RubyextModBlocks.GOLD_INFUSED_LILY.get().asItem());
			tabData.accept(RubyextModBlocks.OBSIDIAN_INFUSED_LILY.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(RubyextModBlocks.CELESTIAL_FLAME.get().asItem());
			tabData.accept(RubyextModBlocks.FLAMEWOOD_LOG.get().asItem());
			tabData.accept(RubyextModBlocks.FLAMEWOOD_WOOD.get().asItem());
			tabData.accept(RubyextModBlocks.STRIPPED_FLAMEWOOD_LOG.get().asItem());
			tabData.accept(RubyextModBlocks.STRIPPED_FLAMEWOOD_WOOD.get().asItem());
			tabData.accept(RubyextModBlocks.FLAMEWOOD_PLANKS.get().asItem());
			tabData.accept(RubyextModBlocks.FLAMEWOOD_STAIRS.get().asItem());
			tabData.accept(RubyextModBlocks.FLAMEWOOD_SLAB.get().asItem());
			tabData.accept(RubyextModBlocks.FLAMEWOOD_FENCE.get().asItem());
			tabData.accept(RubyextModBlocks.FLAMEWOOD_FENCE_GATE.get().asItem());
			tabData.accept(RubyextModBlocks.FLAMEWOOD_DOOR.get().asItem());
			tabData.accept(RubyextModBlocks.FLAMEWOOD_TRAPDOOR.get().asItem());
			tabData.accept(RubyextModBlocks.FLAMEWOOD_PRESSURE_PLATE.get().asItem());
			tabData.accept(RubyextModBlocks.FLAMEWOOD_BUTTON.get().asItem());
			tabData.accept(RubyextModBlocks.TEA_LOG.get().asItem());
			tabData.accept(RubyextModBlocks.TEA_WOOD.get().asItem());
			tabData.accept(RubyextModBlocks.STRIPPED_TEA_LOG.get().asItem());
			tabData.accept(RubyextModBlocks.STRIPPED_TEA_WOOD.get().asItem());
			tabData.accept(RubyextModBlocks.TEA_PLANKS.get().asItem());
			tabData.accept(RubyextModBlocks.TEA_STAIRS.get().asItem());
			tabData.accept(RubyextModBlocks.TEA_SLAB.get().asItem());
			tabData.accept(RubyextModBlocks.TEA_FENCE.get().asItem());
			tabData.accept(RubyextModBlocks.TEA_FENCE_GATE.get().asItem());
			tabData.accept(RubyextModBlocks.TEA_DOOR.get().asItem());
			tabData.accept(RubyextModBlocks.TEA_TRAPDOOR.get().asItem());
			tabData.accept(RubyextModBlocks.TEA_PRESSURE_PLATE.get().asItem());
			tabData.accept(RubyextModBlocks.TEA_BUTTON.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(RubyextModItems.OBSIDIAN_INGOT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(RubyextModItems.OBSIDIAN_PICKAXE.get());
			tabData.accept(RubyextModItems.OBSIDIAN_AXE.get());
			tabData.accept(RubyextModItems.OBSIDIAN_SHOVEL.get());
			tabData.accept(RubyextModItems.OBSIDIAN_HOE.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(RubyextModItems.OBSIDIAN_SWORD.get());
			tabData.accept(RubyextModItems.OBSIDIAN_ARMOR_HELMET.get());
			tabData.accept(RubyextModItems.OBSIDIAN_ARMOR_CHESTPLATE.get());
			tabData.accept(RubyextModItems.OBSIDIAN_ARMOR_LEGGINGS.get());
			tabData.accept(RubyextModItems.OBSIDIAN_ARMOR_BOOTS.get());
		}
	}
}