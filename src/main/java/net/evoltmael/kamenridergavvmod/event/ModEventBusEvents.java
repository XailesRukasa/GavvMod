package net.evoltmael.kamenridergavvmod.event;


import net.evoltmael.kamenridergavvmod.KRGavvMod;
import net.evoltmael.kamenridergavvmod.entity.ModEntities;
import net.evoltmael.kamenridergavvmod.entity.custom.GochizoGummyEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KRGavvMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void regisAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.GOCHIZOGUMMY.get(), GochizoGummyEntity.createAtributes().build());
    }
}
