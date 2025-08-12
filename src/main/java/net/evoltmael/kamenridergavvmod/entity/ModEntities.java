package net.evoltmael.kamenridergavvmod.entity;

import net.evoltmael.kamenridergavvmod.KRGavvMod;
import net.evoltmael.kamenridergavvmod.entity.custom.GochizoGummyEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.common.Tags;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, KRGavvMod.MOD_ID);

    public static final RegistryObject<EntityType<GochizoGummyEntity>> GOCHIZOGUMMY =
            ENTITY_TYPES.register("gochizogummy", () -> EntityType.Builder.of(GochizoGummyEntity::new, MobCategory.CREATURE)
                    .sized(0.5F, 0.5F).build("gochizogummy"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
