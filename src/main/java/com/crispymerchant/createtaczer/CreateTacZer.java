package com.crispymerchant.createtaczer;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(CreateTacZer.MOD_ID)
public class CreateTacZer {

    public static final String MOD_ID = "createtaczer";

    public CreateTacZer(IEventBus modEventBus, ModContainer modContainer) {
        ModItems.register(modEventBus);
    }
}