/*
 * Copyright (C), 2024 Hibiscus Software and contributors. Some rights
 * reserved. This work is licensed under the terms of the MIT license
 * which can be found in the root directory of this project.
 */

package software.hibiscus.doctorwhomod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import software.hibiscus.doctorwhomod.DoctorWhoMod;
import software.hibiscus.doctorwhomod.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, DoctorWhoMod.MOD_ID);

    public static final Supplier<CreativeModeTab> TARDIS_BLOCKS = CREATIVE_MODE_TABS.register("tardis_blocks",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup." + DoctorWhoMod.MOD_ID + ".tardis_blocks"))
                    .icon(() -> new ItemStack(ModBlocks.HELL_BENT_ROUNDEL.get()))
                    .displayItems((params, output) -> {
                        output.accept(ModBlocks.HELL_BENT_ROUNDEL.get());
                        output.accept(ModBlocks.HELL_BENT_ROUNDEL_DOOR.get());
                    })
                    .build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
