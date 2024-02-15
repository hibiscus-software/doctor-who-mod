/*
 * Copyright (C), 2024 Hibiscus Software and contributors. Some rights
 * reserved. This work is licensed under the terms of the MIT license
 * which can be found in the root directory of this project.
 */

package software.hibiscus.doctorwhomod.common.block.tardis.roundel;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class HellBentRoundelAltBottom extends Block {

    public HellBentRoundelAltBottom() {
        super(BlockBehaviour.Properties.of().mapColor(MapColor.STONE));

        registerDefaultState(stateDefinition.any());
    }
}
