package net.evoltmael.kamenridergavvmod.event;

import net.evoltmael.kamenridergavvmod.KRGavvMod;
import net.evoltmael.kamenridergavvmod.entity.client.ModModelLayers;
import net.evoltmael.kamenridergavvmod.entity.client.gochizogummymodel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = KRGavvMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.GOCHIZOGUMMY_LAYER,gochizogummymodel::createBodyLayer);
    }
}
