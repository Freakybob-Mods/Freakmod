package net.mcreator.freakmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class FreakfoodItem extends Item {
	public FreakfoodItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.7f).build()));
	}
}