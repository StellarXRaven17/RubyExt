package net.mcreator.rubyext.network;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RubyextModVariables {
	public static boolean argContainerLoaded = false;
	public static String hubAddress = "\"localhost:25463\"";
	public static boolean visualModMissing = false;

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
	}
}