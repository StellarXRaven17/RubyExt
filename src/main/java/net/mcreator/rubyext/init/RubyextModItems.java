/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubyext.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import net.mcreator.rubyext.item.*;
import net.mcreator.rubyext.RubyextMod;

public class RubyextModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RubyextMod.MODID);
	public static final RegistryObject<Item> WATER_LILY;
	public static final RegistryObject<Item> CELESTIAL_FLAME;
	public static final RegistryObject<Item> FLAMEWOOD_LOG;
	public static final RegistryObject<Item> FLAMEWOOD_WOOD;
	public static final RegistryObject<Item> STRIPPED_FLAMEWOOD_LOG;
	public static final RegistryObject<Item> STRIPPED_FLAMEWOOD_WOOD;
	public static final RegistryObject<Item> FLAMEWOOD_PLANKS;
	public static final RegistryObject<Item> FLAMEWOOD_LEAVES;
	public static final RegistryObject<Item> FLAMEWOOD_STAIRS;
	public static final RegistryObject<Item> FLAMEWOOD_SLAB;
	public static final RegistryObject<Item> FLAMEWOOD_FENCE;
	public static final RegistryObject<Item> FLAMEWOOD_FENCE_GATE;
	public static final RegistryObject<Item> FLAMEWOOD_DOOR;
	public static final RegistryObject<Item> FLAMEWOOD_TRAPDOOR;
	public static final RegistryObject<Item> FLAMEWOOD_PRESSURE_PLATE;
	public static final RegistryObject<Item> FLAMEWOOD_BUTTON;
	public static final RegistryObject<Item> TEA_LOG;
	public static final RegistryObject<Item> TEA_WOOD;
	public static final RegistryObject<Item> STRIPPED_TEA_LOG;
	public static final RegistryObject<Item> STRIPPED_TEA_WOOD;
	public static final RegistryObject<Item> TEA_PLANKS;
	public static final RegistryObject<Item> TEA_LEAVES;
	public static final RegistryObject<Item> TEA_STAIRS;
	public static final RegistryObject<Item> TEA_SLAB;
	public static final RegistryObject<Item> TEA_FENCE;
	public static final RegistryObject<Item> TEA_FENCE_GATE;
	public static final RegistryObject<Item> TEA_DOOR;
	public static final RegistryObject<Item> TEA_TRAPDOOR;
	public static final RegistryObject<Item> TEA_PRESSURE_PLATE;
	public static final RegistryObject<Item> TEA_BUTTON;
	public static final RegistryObject<Item> DEBUG;
	public static final RegistryObject<Item> DEBUG_CROSS;
	public static final RegistryObject<Item> HUB_DOOR;
	public static final RegistryObject<Item> OBSIDIAN_INGOT;
	public static final RegistryObject<Item> OBSIDIAN_PICKAXE;
	public static final RegistryObject<Item> OBSIDIAN_AXE;
	public static final RegistryObject<Item> OBSIDIAN_SWORD;
	public static final RegistryObject<Item> OBSIDIAN_SHOVEL;
	public static final RegistryObject<Item> OBSIDIAN_HOE;
	public static final RegistryObject<Item> OBSIDIAN_ARMOR_HELMET;
	public static final RegistryObject<Item> OBSIDIAN_ARMOR_CHESTPLATE;
	public static final RegistryObject<Item> OBSIDIAN_ARMOR_LEGGINGS;
	public static final RegistryObject<Item> OBSIDIAN_ARMOR_BOOTS;
	public static final RegistryObject<Item> FLAME_INFUSED_LILY;
	public static final RegistryObject<Item> GOLD_INFUSED_LILY;
	public static final RegistryObject<Item> OBSIDIAN_INFUSED_LILY;
	static {
		WATER_LILY = block(RubyextModBlocks.WATER_LILY);
		CELESTIAL_FLAME = block(RubyextModBlocks.CELESTIAL_FLAME);
		FLAMEWOOD_LOG = block(RubyextModBlocks.FLAMEWOOD_LOG);
		FLAMEWOOD_WOOD = block(RubyextModBlocks.FLAMEWOOD_WOOD);
		STRIPPED_FLAMEWOOD_LOG = block(RubyextModBlocks.STRIPPED_FLAMEWOOD_LOG);
		STRIPPED_FLAMEWOOD_WOOD = block(RubyextModBlocks.STRIPPED_FLAMEWOOD_WOOD);
		FLAMEWOOD_PLANKS = block(RubyextModBlocks.FLAMEWOOD_PLANKS);
		FLAMEWOOD_LEAVES = block(RubyextModBlocks.FLAMEWOOD_LEAVES);
		FLAMEWOOD_STAIRS = block(RubyextModBlocks.FLAMEWOOD_STAIRS);
		FLAMEWOOD_SLAB = block(RubyextModBlocks.FLAMEWOOD_SLAB);
		FLAMEWOOD_FENCE = block(RubyextModBlocks.FLAMEWOOD_FENCE);
		FLAMEWOOD_FENCE_GATE = block(RubyextModBlocks.FLAMEWOOD_FENCE_GATE);
		FLAMEWOOD_DOOR = doubleBlock(RubyextModBlocks.FLAMEWOOD_DOOR);
		FLAMEWOOD_TRAPDOOR = block(RubyextModBlocks.FLAMEWOOD_TRAPDOOR);
		FLAMEWOOD_PRESSURE_PLATE = block(RubyextModBlocks.FLAMEWOOD_PRESSURE_PLATE);
		FLAMEWOOD_BUTTON = block(RubyextModBlocks.FLAMEWOOD_BUTTON);
		TEA_LOG = block(RubyextModBlocks.TEA_LOG);
		TEA_WOOD = block(RubyextModBlocks.TEA_WOOD);
		STRIPPED_TEA_LOG = block(RubyextModBlocks.STRIPPED_TEA_LOG);
		STRIPPED_TEA_WOOD = block(RubyextModBlocks.STRIPPED_TEA_WOOD);
		TEA_PLANKS = block(RubyextModBlocks.TEA_PLANKS);
		TEA_LEAVES = block(RubyextModBlocks.TEA_LEAVES);
		TEA_STAIRS = block(RubyextModBlocks.TEA_STAIRS);
		TEA_SLAB = block(RubyextModBlocks.TEA_SLAB);
		TEA_FENCE = block(RubyextModBlocks.TEA_FENCE);
		TEA_FENCE_GATE = block(RubyextModBlocks.TEA_FENCE_GATE);
		TEA_DOOR = doubleBlock(RubyextModBlocks.TEA_DOOR);
		TEA_TRAPDOOR = block(RubyextModBlocks.TEA_TRAPDOOR);
		TEA_PRESSURE_PLATE = block(RubyextModBlocks.TEA_PRESSURE_PLATE);
		TEA_BUTTON = block(RubyextModBlocks.TEA_BUTTON);
		DEBUG = block(RubyextModBlocks.DEBUG);
		DEBUG_CROSS = block(RubyextModBlocks.DEBUG_CROSS);
		HUB_DOOR = doubleBlock(RubyextModBlocks.HUB_DOOR, new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
		OBSIDIAN_INGOT = REGISTRY.register("obsidian_ingot", ObsidianIngotItem::new);
		OBSIDIAN_PICKAXE = REGISTRY.register("obsidian_pickaxe", ObsidianPickaxeItem::new);
		OBSIDIAN_AXE = REGISTRY.register("obsidian_axe", ObsidianAxeItem::new);
		OBSIDIAN_SWORD = REGISTRY.register("obsidian_sword", ObsidianSwordItem::new);
		OBSIDIAN_SHOVEL = REGISTRY.register("obsidian_shovel", ObsidianShovelItem::new);
		OBSIDIAN_HOE = REGISTRY.register("obsidian_hoe", ObsidianHoeItem::new);
		OBSIDIAN_ARMOR_HELMET = REGISTRY.register("obsidian_armor_helmet", ObsidianArmorItem.Helmet::new);
		OBSIDIAN_ARMOR_CHESTPLATE = REGISTRY.register("obsidian_armor_chestplate", ObsidianArmorItem.Chestplate::new);
		OBSIDIAN_ARMOR_LEGGINGS = REGISTRY.register("obsidian_armor_leggings", ObsidianArmorItem.Leggings::new);
		OBSIDIAN_ARMOR_BOOTS = REGISTRY.register("obsidian_armor_boots", ObsidianArmorItem.Boots::new);
		FLAME_INFUSED_LILY = block(RubyextModBlocks.FLAME_INFUSED_LILY);
		GOLD_INFUSED_LILY = block(RubyextModBlocks.GOLD_INFUSED_LILY);
		OBSIDIAN_INFUSED_LILY = block(RubyextModBlocks.OBSIDIAN_INFUSED_LILY);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return doubleBlock(block, new Item.Properties());
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), properties));
	}
}