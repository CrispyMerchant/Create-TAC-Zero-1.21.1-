package com.crispymerchant.createtaczer;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, CreateTacZer.MOD_ID);

    // ---- Raw materials ----
    public static final DeferredHolder<Item, Item> THIN_BRASS_SHEET =
            ITEMS.register("thin_brass_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> THIN_COPPER_SHEET =
            ITEMS.register("thin_copper_sheet", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> BRASS_CUP =
            ITEMS.register("brass_cup", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> COPPER_CUP =
            ITEMS.register("copper_cup", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> BRASS_CYLINDER =
            ITEMS.register("brass_cylinder", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> ANNEALED_BRASS_CYLINDER =
            ITEMS.register("annealed_brass_cylinder", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> SHELL_CASE =
            ITEMS.register("shell_case", () -> new Item(new Item.Properties()));

    // ---- Gunpowder chain ----
    public static final DeferredHolder<Item, Item> GUNPOWDER_CAKE =
            ITEMS.register("gunpowder_cake", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> GUNPOWDER_CAKE_DRY =
            ITEMS.register("gunpowder_cake_dry", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> GUNPOWDER_CYLINDER =
            ITEMS.register("gunpowder_cylinder", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> GUNPOWDER_GRAINS =
            ITEMS.register("gunpowder_grains", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> GUNPOWDER_PELLETS =
            ITEMS.register("gunpowder_pellets", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> GUNPOWDER_CHARGE =
            ITEMS.register("gunpowder_charge", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> RED_PAPER =
            ITEMS.register("red_paper", () -> new Item(new Item.Properties()));

    // ---- Primer chain ----
    public static final DeferredHolder<Item, Item> PRIMER_MIX =
            ITEMS.register("primer_mix", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> PRIMER_ANVILS =
            ITEMS.register("primer_anvils", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> EMPTY_PRIMER_CUPS =
            ITEMS.register("empty_primer_cups", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_PRIMERS =
            ITEMS.register("unfinished_primers", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> PRIMER =
            ITEMS.register("primer", () -> new Item(new Item.Properties()));

    // ---- Bullet components ----
    public static final DeferredHolder<Item, Item> BULLET_CORE =
            ITEMS.register("bullet_core", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> BULLET =
            ITEMS.register("bullet", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> LARGE_BULLET_CORE =
            ITEMS.register("large_bullet_core", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> LARGE_BULLET =
            ITEMS.register("large_bullet", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_LARGE_BULLET =
            ITEMS.register("unfinished_large_bullet", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> PELLETS =
            ITEMS.register("pellets", () -> new Item(new Item.Properties()));

    // ---- 12 Gauge shotgun ----
    public static final DeferredHolder<Item, Item> WAD =
            ITEMS.register("wad", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_WAD =
            ITEMS.register("unfinished_wad", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASE_12G =
            ITEMS.register("case_12g", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_12G =
            ITEMS.register("unfinished_12g", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_CASEFULL_12G =
            ITEMS.register("unfinished_casefull_12g", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_12G =
            ITEMS.register("casefull_12g", () -> new Item(new Item.Properties()));

    // ---- 9mm ----
    public static final DeferredHolder<Item, Item> CASE_9MM =
            ITEMS.register("case_9mm", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_9MM =
            ITEMS.register("unfinished_9mm", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_9MM =
            ITEMS.register("casefull_9mm", () -> new Item(new Item.Properties()));

    // ---- .45 ACP ----
    public static final DeferredHolder<Item, Item> CASE_45ACP =
            ITEMS.register("case_45acp", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_45ACP =
            ITEMS.register("unfinished_45acp", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_45ACP =
            ITEMS.register("casefull_45acp", () -> new Item(new Item.Properties()));

    // ---- .357 Magnum ----
    public static final DeferredHolder<Item, Item> CASE_357MAG =
            ITEMS.register("case_357mag", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_357MAG =
            ITEMS.register("unfinished_357mag", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_357MAG =
            ITEMS.register("casefull_357mag", () -> new Item(new Item.Properties()));

    // ---- .50 AE ----
    public static final DeferredHolder<Item, Item> CASE_50AE =
            ITEMS.register("case_50ae", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_50AE =
            ITEMS.register("unfinished_50ae", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_50AE =
            ITEMS.register("casefull_50ae", () -> new Item(new Item.Properties()));

    // ---- .308 Winchester ----
    public static final DeferredHolder<Item, Item> CASE_308 =
            ITEMS.register("case_308", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_308 =
            ITEMS.register("unfinished_308", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_308 =
            ITEMS.register("casefull_308", () -> new Item(new Item.Properties()));

    // ---- .338 Lapua ----
    public static final DeferredHolder<Item, Item> CASE_338 =
            ITEMS.register("case_338", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_338 =
            ITEMS.register("unfinished_338", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_338 =
            ITEMS.register("casefull_338", () -> new Item(new Item.Properties()));

    // ---- .30-06 Springfield ----
    public static final DeferredHolder<Item, Item> CASE_3006 =
            ITEMS.register("case_3006", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_3006 =
            ITEMS.register("unfinished_3006", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_3006 =
            ITEMS.register("casefull_3006", () -> new Item(new Item.Properties()));

    // ---- .50 BMG ----
    public static final DeferredHolder<Item, Item> CASE_50BMG =
            ITEMS.register("case_50bmg", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_CASE_50BMG =
            ITEMS.register("unfinished_case_50bmg", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_50BMG =
            ITEMS.register("unfinished_50bmg", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_50BMG =
            ITEMS.register("casefull_50bmg", () -> new Item(new Item.Properties()));

    // ---- 45-70 ----
    public static final DeferredHolder<Item, Item> CASE_4570 =
            ITEMS.register("case_4570", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_4570 =
            ITEMS.register("unfinished_4570", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_4570 =
            ITEMS.register("casefull_4570", () -> new Item(new Item.Properties()));

    // ---- 5.56x45mm ----
    public static final DeferredHolder<Item, Item> CASE_55645 =
            ITEMS.register("case_55645", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_55645 =
            ITEMS.register("unfinished_55645", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_55645 =
            ITEMS.register("casefull_55645", () -> new Item(new Item.Properties()));

    // ---- 5.45x39mm ----
    public static final DeferredHolder<Item, Item> CASE_54539 =
            ITEMS.register("case_54539", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_54539 =
            ITEMS.register("unfinished_54539", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_54539 =
            ITEMS.register("casefull_54539", () -> new Item(new Item.Properties()));

    // ---- 7.62x39mm ----
    public static final DeferredHolder<Item, Item> CASE_76239 =
            ITEMS.register("case_76239", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_76239 =
            ITEMS.register("unfinished_76239", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_76239 =
            ITEMS.register("casefull_76239", () -> new Item(new Item.Properties()));

    // ---- 7.62x54mm ----
    public static final DeferredHolder<Item, Item> CASE_76254 =
            ITEMS.register("case_76254", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_76254 =
            ITEMS.register("unfinished_76254", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_76254 =
            ITEMS.register("casefull_76254", () -> new Item(new Item.Properties()));

    // ---- 7.62x25mm Tokarev ----
    public static final DeferredHolder<Item, Item> CASE_76225 =
            ITEMS.register("case_76225", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_76225 =
            ITEMS.register("unfinished_76225", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_76225 =
            ITEMS.register("casefull_76225", () -> new Item(new Item.Properties()));

    // ---- 5.7x28mm AP ----
    public static final DeferredHolder<Item, Item> CASE_5728 =
            ITEMS.register("case_5728", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_5728 =
            ITEMS.register("unfinished_5728", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_5728 =
            ITEMS.register("casefull_5728", () -> new Item(new Item.Properties()));

    // ---- 4.6mm AP ----
    public static final DeferredHolder<Item, Item> CASE_4630 =
            ITEMS.register("case_4630", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_4630 =
            ITEMS.register("unfinished_4630", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_4630 =
            ITEMS.register("casefull_4630", () -> new Item(new Item.Properties()));

    // ---- 5.8mm DBP87 ----
    public static final DeferredHolder<Item, Item> CASE_5842 =
            ITEMS.register("case_5842", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_5842 =
            ITEMS.register("unfinished_5842", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_5842 =
            ITEMS.register("casefull_5842", () -> new Item(new Item.Properties()));

    // ---- 6.8x51mm Fury ----
    public static final DeferredHolder<Item, Item> CASE_6851FURY =
            ITEMS.register("case_6851fury", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_6851FURY =
            ITEMS.register("unfinished_6851fury", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> CASEFULL_6851FURY =
            ITEMS.register("casefull_6851fury", () -> new Item(new Item.Properties()));

    // ---- 40mm Grenade ----
    public static final DeferredHolder<Item, Item> FUSE_40MM =
            ITEMS.register("fuse_40mm", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> BOOSTER_CHARGE_40MM =
            ITEMS.register("booster_charge_40mm", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> EXPLOSIVE_CHARGE_40MM =
            ITEMS.register("explosive_charge_40mm", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> FUSELESS_40MM =
            ITEMS.register("fuseless_40mm", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_40MM =
            ITEMS.register("unfinished_40mm", () -> new Item(new Item.Properties()));

    // ---- RPG-7 ----
    public static final DeferredHolder<Item, Item> RPG_WARHEAD =
            ITEMS.register("rpg_warhead", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> RPG_BOOSTER_CHARGE =
            ITEMS.register("rpg_booster_charge", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> RPG_SUSTAINER_MOTOR =
            ITEMS.register("rpg_sustainer_motor", () -> new Item(new Item.Properties()));
    public static final DeferredHolder<Item, Item> UNFINISHED_RPG_ROCKET =
            ITEMS.register("unfinished_rpg_rocket", () -> new Item(new Item.Properties()));

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}