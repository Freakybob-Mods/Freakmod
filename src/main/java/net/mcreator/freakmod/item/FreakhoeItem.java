package net.mcreator.freakmod.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class FreakhoeItem extends HoeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 4.5f, 0, 13, TagKey.create(Registries.ITEM, ResourceLocation.parse("freakmod:freakhoe_repair_items")));

	public FreakhoeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 0f, -2f, properties);
	}
}