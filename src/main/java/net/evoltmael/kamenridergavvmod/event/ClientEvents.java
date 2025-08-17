package net.evoltmael.kamenridergavvmod.event;

import net.evoltmael.kamenridergavvmod.KRGavvMod;
import net.evoltmael.kamenridergavvmod.util.KeyBinding;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = KRGavvMod.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {

        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if(KeyBinding.HENSHIN_KEY.consumeClick()) {
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("Transformed"));
            }
        }
    }
    @Mod.EventBusSubscriber(modid = KRGavvMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent event){
            event.register(KeyBinding.HENSHIN_KEY);

        }
    }
}
