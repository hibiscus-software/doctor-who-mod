/*
 * Copyright (C), 2024 Hibiscus Software and contributors. Some rights
 * reserved. This work is licensed under the terms of the MIT license
 * which can be found in the root directory of this project.
 */

package software.hibiscus.doctorwhomod.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import software.hibiscus.doctorwhomod.DoctorWhoMod;
import software.hibiscus.doctorwhomod.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    private static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(DoctorWhoMod.MOD_ID);

    public static final DeferredBlock<Block> HELL_BENT_ROUNDEL = registerBlock("hell_bent_roundel",
            HellBentRoundel::new);

    public static final DeferredBlock<Block> HELL_BENT_ROUNDEL_DOOR = registerBlock("hell_bent_roundel_door",
            HellBentRoundelDoor::new);

    private static DeferredBlock<Block> registerBlock(String blockName, Supplier<Block> blockSupplier) {
        DeferredBlock<Block> blockRegister = BLOCKS.register(blockName, blockSupplier);

        registerBlockItem(blockName, blockRegister);

        return blockRegister;
    }

    private static DeferredItem<BlockItem> registerBlockItem(String blockName, Supplier<Block> blockSupplier) {
        return ModItems.ITEMS.registerSimpleBlockItem(blockName, blockSupplier);
    }

    public static void register(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }
}
