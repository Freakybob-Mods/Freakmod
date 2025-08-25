package net.mcreator.freakmod.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class FreakaxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 4.5f, 0, 13, TagKey.create(Registries.ITEM, ResourceLocation.parse("freakmod:freakaxe_repair_items")));

	public FreakaxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 8f, -3.15f, properties);
	}
}