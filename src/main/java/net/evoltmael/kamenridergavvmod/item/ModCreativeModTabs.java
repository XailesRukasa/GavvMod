package net.evoltmael.kamenridergavvmod.item;

import net.evoltmael.kamenridergavvmod.KRGavvMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KRGavvMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> KRGAVV_TAB = CREATIVE_MODE_TABS.register("krgavv_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GOCHIZO_GUMMY.get()))
                    .title(Component.translatable("creatitetab.krgavv_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.GOCHIZO_GUMMY.get());


                        output.accept(ModItems.NORMALCHIPS.get());
                    })
                    .build());

            public static void register(IEventBus eventBus) {
                CREATIVE_MODE_TABS.register(eventBus);
            }

}
