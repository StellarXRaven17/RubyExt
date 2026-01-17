/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubyext.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.rubyext.block.*;
import net.mcreator.rubyext.RubyextMod;

public class RubyextModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RubyextMod.MODID);
	public static final RegistryObject<Block> WATER_LILY;
	public static final RegistryObject<Block> CELESTIAL_FLAME;
	public static final RegistryObject<Block> FLAMEWOOD_LOG;
	public static final RegistryObject<Block> FLAMEWOOD_WOOD;
	public static final RegistryObject<Block> STRIPPED_FLAMEWOOD_LOG;
	public static final RegistryObject<Block> STRIPPED_FLAMEWOOD_WOOD;
	public static final RegistryObject<Block> FLAMEWOOD_PLANKS;
	public static final RegistryObject<Block> FLAMEWOOD_LEAVES;
	public static final RegistryObject<Block> FLAMEWOOD_STAIRS;
	public static final RegistryObject<Block> FLAMEWOOD_SLAB;
	public static final RegistryObject<Block> FLAMEWOOD_FENCE;
	public static final RegistryObject<Block> FLAMEWOOD_FENCE_GATE;
	public static final RegistryObject<Block> FLAMEWOOD_DOOR;
	public static final RegistryObject<Block> FLAMEWOOD_TRAPDOOR;
	public static final RegistryObject<Block> FLAMEWOOD_PRESSURE_PLATE;
	public static final RegistryObject<Block> FLAMEWOOD_BUTTON;
	public static final RegistryObject<Block> TEA_LOG;
	public static final RegistryObject<Block> TEA_WOOD;
	public static final RegistryObject<Block> STRIPPED_TEA_LOG;
	public static final RegistryObject<Block> STRIPPED_TEA_WOOD;
	public static final RegistryObject<Block> TEA_PLANKS;
	public static final RegistryObject<Block> TEA_LEAVES;
	public static final RegistryObject<Block> TEA_STAIRS;
	public static final RegistryObject<Block> TEA_SLAB;
	public static final RegistryObject<Block> TEA_FENCE;
	public static final RegistryObject<Block> TEA_FENCE_GATE;
	public static final RegistryObject<Block> TEA_DOOR;
	public static final RegistryObject<Block> TEA_TRAPDOOR;
	public static final RegistryObject<Block> TEA_PRESSURE_PLATE;
	public static final RegistryObject<Block> TEA_BUTTON;
	public static final RegistryObject<Block> DEBUG;
	public static final RegistryObject<Block> DEBUG_CROSS;
	public static final RegistryObject<Block> HUB_DOOR;
	public static final RegistryObject<Block> FLAME_INFUSED_LILY;
	public static final RegistryObject<Block> GOLD_INFUSED_LILY;
	public static final RegistryObject<Block> OBSIDIAN_INFUSED_LILY;
	static {
		WATER_LILY = REGISTRY.register("water_lily", WaterLilyBlock::new);
		CELESTIAL_FLAME = REGISTRY.register("celestial_flame", CelestialFlameBlock::new);
		FLAMEWOOD_LOG = REGISTRY.register("flamewood_log", FlamewoodLogBlock::new);
		FLAMEWOOD_WOOD = REGISTRY.register("flamewood_wood", FlamewoodWoodBlock::new);
		STRIPPED_FLAMEWOOD_LOG = REGISTRY.register("stripped_flamewood_log", StrippedFlamewoodLogBlock::new);
		STRIPPED_FLAMEWOOD_WOOD = REGISTRY.register("stripped_flamewood_wood", StrippedFlamewoodWoodBlock::new);
		FLAMEWOOD_PLANKS = REGISTRY.register("flamewood_planks", FlamewoodPlanksBlock::new);
		FLAMEWOOD_LEAVES = REGISTRY.register("flamewood_leaves", FlamewoodLeavesBlock::new);
		FLAMEWOOD_STAIRS = REGISTRY.register("flamewood_stairs", FlamewoodStairsBlock::new);
		FLAMEWOOD_SLAB = REGISTRY.register("flamewood_slab", FlamewoodSlabBlock::new);
		FLAMEWOOD_FENCE = REGISTRY.register("flamewood_fence", FlamewoodFenceBlock::new);
		FLAMEWOOD_FENCE_GATE = REGISTRY.register("flamewood_fence_gate", FlamewoodFenceGateBlock::new);
		FLAMEWOOD_DOOR = REGISTRY.register("flamewood_door", FlamewoodDoorBlock::new);
		FLAMEWOOD_TRAPDOOR = REGISTRY.register("flamewood_trapdoor", FlamewoodTrapdoorBlock::new);
		FLAMEWOOD_PRESSURE_PLATE = REGISTRY.register("flamewood_pressure_plate", FlamewoodPressurePlateBlock::new);
		FLAMEWOOD_BUTTON = REGISTRY.register("flamewood_button", FlamewoodButtonBlock::new);
		TEA_LOG = REGISTRY.register("tea_log", TeaLogBlock::new);
		TEA_WOOD = REGISTRY.register("tea_wood", TeaWoodBlock::new);
		STRIPPED_TEA_LOG = REGISTRY.register("stripped_tea_log", StrippedTeaLogBlock::new);
		STRIPPED_TEA_WOOD = REGISTRY.register("stripped_tea_wood", StrippedTeaWoodBlock::new);
		TEA_PLANKS = REGISTRY.register("tea_planks", TeaPlanksBlock::new);
		TEA_LEAVES = REGISTRY.register("tea_leaves", TeaLeavesBlock::new);
		TEA_STAIRS = REGISTRY.register("tea_stairs", TeaStairsBlock::new);
		TEA_SLAB = REGISTRY.register("tea_slab", TeaSlabBlock::new);
		TEA_FENCE = REGISTRY.register("tea_fence", TeaFenceBlock::new);
		TEA_FENCE_GATE = REGISTRY.register("tea_fence_gate", TeaFenceGateBlock::new);
		TEA_DOOR = REGISTRY.register("tea_door", TeaDoorBlock::new);
		TEA_TRAPDOOR = REGISTRY.register("tea_trapdoor", TeaTrapdoorBlock::new);
		TEA_PRESSURE_PLATE = REGISTRY.register("tea_pressure_plate", TeaPressurePlateBlock::new);
		TEA_BUTTON = REGISTRY.register("tea_button", TeaButtonBlock::new);
		DEBUG = REGISTRY.register("debug", DebugBlock::new);
		DEBUG_CROSS = REGISTRY.register("debug_cross", DebugCrossBlock::new);
		HUB_DOOR = REGISTRY.register("hub_door", HubDoorBlock::new);
		FLAME_INFUSED_LILY = REGISTRY.register("flame_infused_lily", FlameInfusedLilyBlock::new);
		GOLD_INFUSED_LILY = REGISTRY.register("gold_infused_lily", GoldInfusedLilyBlock::new);
		OBSIDIAN_INFUSED_LILY = REGISTRY.register("obsidian_infused_lily", ObsidianInfusedLilyBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			TeaLeavesBlock.blockColorLoad(event);
		}
	}
}