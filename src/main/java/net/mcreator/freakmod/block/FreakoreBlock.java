package net.mcreator.freakmod.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class FreakoreBlock extends Block {
	public FreakoreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(3.25f, 10f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.SNARE));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 15;
	}
}