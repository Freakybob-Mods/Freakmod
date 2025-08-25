/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.freakmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.freakmod.block.FreakoreBlock;
import net.mcreator.freakmod.block.FreakgrassBlock;
import net.mcreator.freakmod.block.FreakdirtBlock;
import net.mcreator.freakmod.block.FreakblockBlock;
import net.mcreator.freakmod.block.DeepslatefreakoreBlock;
import net.mcreator.freakmod.FreakmodMod;

import java.util.function.Function;

public class FreakmodModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(FreakmodMod.MODID);
	public static final DeferredBlock<Block> FREAKGRASS = register("freakgrass", FreakgrassBlock::new);
	public static final DeferredBlock<Block> FREAKDIRT = register("freakdirt", FreakdirtBlock::new);
	public static final DeferredBlock<Block> FREAKBLOCK = register("freakblock", FreakblockBlock::new);
	public static final DeferredBlock<Block> FREAKORE = register("freakore", FreakoreBlock::new);
	public static final DeferredBlock<Block> DEEPSLATEFREAKORE = register("deepslatefreakore", DeepslatefreakoreBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier, BlockBehaviour.Properties.of());
	}
}