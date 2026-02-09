package net.mcreator.rubyext.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.mcreator.rubyext.network.RubyextModVariables;
import net.mcreator.rubyext.RubyextMod;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CheckForRequiredVisualModsProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event);
	}

	public static void execute() {
		execute(null);
	}

	private static void execute(@Nullable Event event) {
		if (ModList.get().isLoaded("polytone") || ModList.get().isLoaded("optifine")) {
			RubyextModVariables.visualModMissing = false;
			RubyextMod.LOGGER.debug("Polytone or Optifine detected!");
		}
	}
}