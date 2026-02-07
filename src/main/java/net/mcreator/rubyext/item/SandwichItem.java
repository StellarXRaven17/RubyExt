package net.mcreator.rubyext.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SandwichItem extends Item {
	public SandwichItem() {
		super(new Item.Properties().food((new FoodProperties.Builder()).nutrition(4).saturationMod(0.3f).build()));
	}
}