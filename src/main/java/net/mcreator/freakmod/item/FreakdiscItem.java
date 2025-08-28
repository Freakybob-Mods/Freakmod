package net.mcreator.freakmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.freakmod.FreakmodMod;

public class FreakdiscItem extends Item {
	public FreakdiscItem(Item.Properties properties) {
		super(properties.jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(FreakmodMod.MODID, "freakdisc"))));
	}
}