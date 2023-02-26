package net.kaazikin.timhortons.item;

import net.kaazikin.timhortons.TimHortonsMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TimHortonsMod.MOD_ID);

    public static final RegistryObject<Item> TIMBIT = ITEMS.register("timbit",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));

    public static final RegistryObject<Item> BIRTHDAY_TIMBIT = ITEMS.register("birthday_timbit",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_FOOD)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
