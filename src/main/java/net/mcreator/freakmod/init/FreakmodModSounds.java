/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.freakmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.freakmod.FreakmodMod;

public class FreakmodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, FreakmodMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> DISC = REGISTRY.register("disc", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("freakmod", "disc")));
}