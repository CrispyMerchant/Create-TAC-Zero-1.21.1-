package com.crispymerchant.createtaczer;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateTacZer.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> CREATETACZER_TAB =
            CREATIVE_MODE_TABS.register("createtaczer_tab", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.createtaczer.tab"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> ModItems.CASEFULL_9MM.get().getDefaultInstance())
                    .displayItems((parameters, output) -> {
                        // Raw materials
                        output.accept(ModItems.THIN_BRASS_SHEET.get());
                        output.accept(ModItems.THIN_COPPER_SHEET.get());
                        output.accept(ModItems.BRASS_CUP.get());
                        output.accept(ModItems.COPPER_CUP.get());
                        output.accept(ModItems.BRASS_CYLINDER.get());
                        output.accept(ModItems.ANNEALED_BRASS_CYLINDER.get());
                        output.accept(ModItems.SHELL_CASE.get());

                        // Gunpowder chain
                        output.accept(ModItems.GUNPOWDER_CAKE.get());
                        output.accept(ModItems.GUNPOWDER_CAKE_DRY.get());
                        output.accept(ModItems.GUNPOWDER_CYLINDER.get());
                        output.accept(ModItems.GUNPOWDER_GRAINS.get());
                        output.accept(ModItems.GUNPOWDER_PELLETS.get());
                        output.accept(ModItems.GUNPOWDER_CHARGE.get());
                        output.accept(ModItems.RED_PAPER.get());

                        // Primer chain
                        output.accept(ModItems.PRIMER_MIX.get());
                        output.accept(ModItems.PRIMER_ANVILS.get());
                        output.accept(ModItems.EMPTY_PRIMER_CUPS.get());
                        output.accept(ModItems.UNFINISHED_PRIMERS.get());
                        output.accept(ModItems.PRIMER.get());

                        // Bullet components
                        output.accept(ModItems.BULLET_CORE.get());
                        output.accept(ModItems.BULLET.get());
                        output.accept(ModItems.LARGE_BULLET_CORE.get());
                        output.accept(ModItems.LARGE_BULLET.get());
                        output.accept(ModItems.UNFINISHED_LARGE_BULLET.get());
                        output.accept(ModItems.PELLETS.get());

                        // 12 Gauge
                        output.accept(ModItems.UNFINISHED_WAD.get());
                        output.accept(ModItems.WAD.get());
                        output.accept(ModItems.CASE_12G.get());
                        output.accept(ModItems.UNFINISHED_12G.get());
                        output.accept(ModItems.UNFINISHED_CASEFULL_12G.get());
                        output.accept(ModItems.CASEFULL_12G.get());

                        // 9mm
                        output.accept(ModItems.CASE_9MM.get());
                        output.accept(ModItems.UNFINISHED_9MM.get());
                        output.accept(ModItems.CASEFULL_9MM.get());

                        // .45 ACP
                        output.accept(ModItems.CASE_45ACP.get());
                        output.accept(ModItems.UNFINISHED_45ACP.get());
                        output.accept(ModItems.CASEFULL_45ACP.get());

                        // .357 Magnum
                        output.accept(ModItems.CASE_357MAG.get());
                        output.accept(ModItems.UNFINISHED_357MAG.get());
                        output.accept(ModItems.CASEFULL_357MAG.get());

                        // .50 AE
                        output.accept(ModItems.CASE_50AE.get());
                        output.accept(ModItems.UNFINISHED_50AE.get());
                        output.accept(ModItems.CASEFULL_50AE.get());

                        // .308 Winchester
                        output.accept(ModItems.CASE_308.get());
                        output.accept(ModItems.UNFINISHED_308.get());
                        output.accept(ModItems.CASEFULL_308.get());

                        // .338 Lapua
                        output.accept(ModItems.CASE_338.get());
                        output.accept(ModItems.UNFINISHED_338.get());
                        output.accept(ModItems.CASEFULL_338.get());

                        // .30-06 Springfield
                        output.accept(ModItems.CASE_3006.get());
                        output.accept(ModItems.UNFINISHED_3006.get());
                        output.accept(ModItems.CASEFULL_3006.get());

                        // .50 BMG
                        output.accept(ModItems.CASE_50BMG.get());
                        output.accept(ModItems.UNFINISHED_CASE_50BMG.get());
                        output.accept(ModItems.UNFINISHED_50BMG.get());
                        output.accept(ModItems.CASEFULL_50BMG.get());

                        // 45-70
                        output.accept(ModItems.CASE_4570.get());
                        output.accept(ModItems.UNFINISHED_4570.get());
                        output.accept(ModItems.CASEFULL_4570.get());

                        // 5.56x45mm
                        output.accept(ModItems.CASE_55645.get());
                        output.accept(ModItems.UNFINISHED_55645.get());
                        output.accept(ModItems.CASEFULL_55645.get());

                        // 5.45x39mm
                        output.accept(ModItems.CASE_54539.get());
                        output.accept(ModItems.UNFINISHED_54539.get());
                        output.accept(ModItems.CASEFULL_54539.get());

                        // 7.62x39mm
                        output.accept(ModItems.CASE_76239.get());
                        output.accept(ModItems.UNFINISHED_76239.get());
                        output.accept(ModItems.CASEFULL_76239.get());

                        // 7.62x54mm
                        output.accept(ModItems.CASE_76254.get());
                        output.accept(ModItems.UNFINISHED_76254.get());
                        output.accept(ModItems.CASEFULL_76254.get());

                        // 7.62x25mm Tokarev
                        output.accept(ModItems.CASE_76225.get());
                        output.accept(ModItems.UNFINISHED_76225.get());
                        output.accept(ModItems.CASEFULL_76225.get());

                        // 5.7x28mm AP
                        output.accept(ModItems.CASE_5728.get());
                        output.accept(ModItems.UNFINISHED_5728.get());
                        output.accept(ModItems.CASEFULL_5728.get());

                        // 4.6mm AP
                        output.accept(ModItems.CASE_4630.get());
                        output.accept(ModItems.UNFINISHED_4630.get());
                        output.accept(ModItems.CASEFULL_4630.get());

                        // 5.8mm DBP87
                        output.accept(ModItems.CASE_5842.get());
                        output.accept(ModItems.UNFINISHED_5842.get());
                        output.accept(ModItems.CASEFULL_5842.get());

                        // 6.8x51mm Fury
                        output.accept(ModItems.CASE_6851FURY.get());
                        output.accept(ModItems.UNFINISHED_6851FURY.get());
                        output.accept(ModItems.CASEFULL_6851FURY.get());

                        // 40mm Grenade
                        output.accept(ModItems.FUSE_40MM.get());
                        output.accept(ModItems.BOOSTER_CHARGE_40MM.get());
                        output.accept(ModItems.EXPLOSIVE_CHARGE_40MM.get());
                        output.accept(ModItems.FUSELESS_40MM.get());
                        output.accept(ModItems.UNFINISHED_40MM.get());

                        // RPG-7
                        output.accept(ModItems.RPG_WARHEAD.get());
                        output.accept(ModItems.RPG_BOOSTER_CHARGE.get());
                        output.accept(ModItems.RPG_SUSTAINER_MOTOR.get());
                        output.accept(ModItems.UNFINISHED_RPG_ROCKET.get());
                    })
                    .build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}