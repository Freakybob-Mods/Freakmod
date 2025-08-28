/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.freakmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.freakmod.FreakmodMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class FreakmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FreakmodMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FREAKTAB = REGISTRY.register("freaktab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.freakmod.freaktab")).icon(() -> new ItemStack(FreakmodModItems.FREAKINGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FreakmodModItems.FREAKBOB.get());
				tabData.accept(FreakmodModItems.FREAK_HELMET.get());
				tabData.accept(FreakmodModItems.FREAK_CHESTPLATE.get());
				tabData.accept(FreakmodModItems.FREAK_LEGGINGS.get());
				tabData.accept(FreakmodModItems.FREAK_BOOTS.get());
				tabData.accept(FreakmodModItems.FREAKINGOT.get());
				tabData.accept(FreakmodModItems.FREAKSWORD.get());
				tabData.accept(FreakmodModItems.FREAKPICKAXE.get());
				tabData.accept(FreakmodModItems.FREAKAXE.get());
				tabData.accept(FreakmodModItems.FREAKSHOVEL.get());
				tabData.accept(FreakmodModItems.FREAKHOE.get());
				tabData.accept(FreakmodModItems.FREAKFOOD.get());
				tabData.accept(FreakmodModItems.EATENFREAKCARROT.get());
				tabData.accept(FreakmodModBlocks.FREAKGRASS.get().asItem());
				tabData.accept(FreakmodModBlocks.FREAKDIRT.get().asItem());
				tabData.accept(FreakmodModBlocks.FREAKBLOCK.get().asItem());
				tabData.accept(FreakmodModBlocks.FREAKORE.get().asItem());
				tabData.accept(FreakmodModItems.FREAKARROW.get());
				tabData.accept(FreakmodModItems.MULTIFREAK.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(FreakmodModItems.FREAK_HELMET.get());
			tabData.accept(FreakmodModItems.FREAK_CHESTPLATE.get());
			tabData.accept(FreakmodModItems.FREAK_LEGGINGS.get());
			tabData.accept(FreakmodModItems.FREAK_BOOTS.get());
			tabData.accept(FreakmodModItems.FREAKSWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(FreakmodModItems.FREAKPICKAXE.get());
			tabData.accept(FreakmodModItems.FREAKAXE.get());
			tabData.accept(FreakmodModItems.FREAKSHOVEL.get());
			tabData.accept(FreakmodModItems.FREAKHOE.get());
			tabData.accept(FreakmodModItems.MULTIFREAK.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
			tabData.accept(FreakmodModItems.FREAKFOOD.get());
		}
	}
}