package net.evoltmael.kamenridergavvmod.item;

import net.evoltmael.kamenridergavvmod.KRGavvMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, KRGavvMod.MOD_ID);

    public static final RegistryObject<Item> GOCHIZO_GUMMY = ITEMS.register("gochizogummy",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NORMALCHIPS = ITEMS.register("normalchips",
            () -> new Item(new Item.Properties().food(ModFood.NORMALCHIPS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
