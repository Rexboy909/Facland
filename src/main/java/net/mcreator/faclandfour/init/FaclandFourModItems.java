
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.faclandfour.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.faclandfour.item.StarRodItem;
import net.mcreator.faclandfour.item.ProtectionfourpickaxeItem;
import net.mcreator.faclandfour.item.OatmealItem;
import net.mcreator.faclandfour.item.KnockbacknemoItem;
import net.mcreator.faclandfour.item.KirbyscakeItem;
import net.mcreator.faclandfour.item.KirbygunammoItem;
import net.mcreator.faclandfour.item.KirbygunItem;
import net.mcreator.faclandfour.item.InfinitestoneItem;
import net.mcreator.faclandfour.item.InfinitepearlItem;
import net.mcreator.faclandfour.FaclandFourMod;

public class FaclandFourModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FaclandFourMod.MODID);
	public static final RegistryObject<Item> INFINITEPEARL = REGISTRY.register("infinitepearl", () -> new InfinitepearlItem());
	public static final RegistryObject<Item> PROTECTIONFOURPICKAXE = REGISTRY.register("protectionfourpickaxe",
			() -> new ProtectionfourpickaxeItem());
	public static final RegistryObject<Item> INFINITESTONE = REGISTRY.register("infinitestone", () -> new InfinitestoneItem());
	public static final RegistryObject<Item> KIRBYGUNAMMO = REGISTRY.register("kirbygunammo", () -> new KirbygunammoItem());
	public static final RegistryObject<Item> KIRBYGUN = REGISTRY.register("kirbygun", () -> new KirbygunItem());
	public static final RegistryObject<Item> KIRBYSCAKE = REGISTRY.register("kirbyscake", () -> new KirbyscakeItem());
	public static final RegistryObject<Item> STAR_ROD = REGISTRY.register("star_rod", () -> new StarRodItem());
	public static final RegistryObject<Item> KNOCKBACKNEMO = REGISTRY.register("knockbacknemo", () -> new KnockbacknemoItem());
	public static final RegistryObject<Item> OATMEAL = REGISTRY.register("oatmeal", () -> new OatmealItem());
}
