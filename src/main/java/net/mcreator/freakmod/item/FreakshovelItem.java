package net.mcreator.freakmod.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class FreakshovelItem extends ShovelItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 4.5f, 0, 13, TagKey.create(Registries.ITEM, ResourceLocation.parse("freakmod:freakshovel_repair_items")));

	public FreakshovelItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 1.2f, -3f, properties);
	}
}