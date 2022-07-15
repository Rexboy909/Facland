
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.faclandfour.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.faclandfour.item.InfinitepearlItem;
import net.mcreator.faclandfour.FaclandFourMod;

public class FaclandFourModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FaclandFourMod.MODID);
	public static final RegistryObject<Item> INFINITEPEARL = REGISTRY.register("infinitepearl", () -> new InfinitepearlItem());
}
