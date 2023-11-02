package net.kaazikin.timhortons.item;

import net.kaazikin.timhortons.TimHortonsMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TimHortonsMod.MOD_ID);

    public static final RegistryObject<Item> TIMBIT = ITEMS.register("timbit",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.5F).alwaysEat().build())));

    public static final RegistryObject<Item> BIRTHDAY_TIMBIT = ITEMS.register("birthday_timbit",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(0.8F).alwaysEat().build())));
    public static final RegistryObject<Item> CHOCOLATE_TIMBIT = ITEMS.register("chocolate_timbit",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(3).saturationMod(1F).alwaysEat().build())));
    public static final RegistryObject<Item> RASPBERRY_TIMBIT = ITEMS.register("raspberry_timbit",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(4).saturationMod(2F).alwaysEat().build())
                    .rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> TURTLE_TIMBIT = ITEMS.register("turtle_timbit",
            () -> new Item(new Item.Properties().fireResistant().stacksTo(1).food
                            (new FoodProperties.Builder().nutrition(10).saturationMod(1F).alwaysEat().
                                    effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 800, 4), 0.7F).build())
                    .rarity(Rarity.RARE)));

    public static final RegistryObject<Item> CHOCOLATE_ESPRESSO_TIMBIT = ITEMS.register("chocolate_espresso_timbit",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().nutrition(5).saturationMod(2.5F).alwaysEat().build())
                    .rarity(Rarity.UNCOMMON)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
