
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.faclandfour.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.faclandfour.entity.KirbygunEntity;
import net.mcreator.faclandfour.entity.InfinitepearlEntity;
import net.mcreator.faclandfour.FaclandFourMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FaclandFourModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, FaclandFourMod.MODID);
	public static final RegistryObject<EntityType<InfinitepearlEntity>> INFINITEPEARL = register("projectile_infinitepearl",
			EntityType.Builder.<InfinitepearlEntity>of(InfinitepearlEntity::new, MobCategory.MISC).setCustomClientFactory(InfinitepearlEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<KirbygunEntity>> KIRBYGUN = register("projectile_kirbygun",
			EntityType.Builder.<KirbygunEntity>of(KirbygunEntity::new, MobCategory.MISC).setCustomClientFactory(KirbygunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
	}
}
