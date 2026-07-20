package net.yumin.silver.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.yumin.silver.Silver;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Silver.MOD_ID);

    public  static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
            () -> new Item(new Item.Properties()));

    public  static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin",
            () -> new Item(new Item.Properties()));


    public  static final RegistryObject<Item> RAW_SILVER = ITEMS.register("raw_silver",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
