/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.freakmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.freakmod.item.FreakswordItem;
import net.mcreator.freakmod.item.FreakshovelItem;
import net.mcreator.freakmod.item.FreakpickaxeItem;
import net.mcreator.freakmod.item.FreakingotItem;
import net.mcreator.freakmod.item.FreakhoeItem;
import net.mcreator.freakmod.item.FreakfoodItem;
import net.mcreator.freakmod.item.FreakbobItem;
import net.mcreator.freakmod.item.FreakaxeItem;
import net.mcreator.freakmod.item.FreakarrowItem;
import net.mcreator.freakmod.item.FreakItem;
import net.mcreator.freakmod.item.EatenfreakcarrotItem;
import net.mcreator.freakmod.FreakmodMod;

import java.util.function.Function;

public class FreakmodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FreakmodMod.MODID);
	public static final DeferredItem<Item> FREAKBOB = register("freakbob", FreakbobItem::new);
	public static final DeferredItem<Item> FREAK_HELMET = register("freak_helmet", FreakItem.Helmet::new);
	public static final DeferredItem<Item> FREAK_CHESTPLATE = register("freak_chestplate", FreakItem.Chestplate::new);
	public static final DeferredItem<Item> FREAK_LEGGINGS = register("freak_leggings", FreakItem.Leggings::new);
	public static final DeferredItem<Item> FREAK_BOOTS = register("freak_boots", FreakItem.Boots::new);
	public static final DeferredItem<Item> FREAKINGOT = register("freakingot", FreakingotItem::new);
	public static final DeferredItem<Item> FREAKSWORD = register("freaksword", FreakswordItem::new);
	public static final DeferredItem<Item> FREAKPICKAXE = register("freakpickaxe", FreakpickaxeItem::new);
	public static final DeferredItem<Item> FREAKAXE = register("freakaxe", FreakaxeItem::new);
	public static final DeferredItem<Item> FREAKSHOVEL = register("freakshovel", FreakshovelItem::new);
	public static final DeferredItem<Item> FREAKHOE = register("freakhoe", FreakhoeItem::new);
	public static final DeferredItem<Item> FREAKFOOD = register("freakfood", FreakfoodItem::new);
	public static final DeferredItem<Item> EATENFREAKCARROT = register("eatenfreakcarrot", EatenfreakcarrotItem::new);
	public static final DeferredItem<Item> FREAKGRASS = block(FreakmodModBlocks.FREAKGRASS);
	public static final DeferredItem<Item> FREAKDIRT = block(FreakmodModBlocks.FREAKDIRT);
	public static final DeferredItem<Item> FREAKBLOCK = block(FreakmodModBlocks.FREAKBLOCK);
	public static final DeferredItem<Item> FREAKORE = block(FreakmodModBlocks.FREAKORE);
	public static final DeferredItem<Item> DEEPSLATEFREAKORE = block(FreakmodModBlocks.DEEPSLATEFREAKORE);
	public static final DeferredItem<Item> FREAKARROW = register("freakarrow", FreakarrowItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}