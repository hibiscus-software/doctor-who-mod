/*
 * Copyright (C), 2024 Hibiscus Software and contributors. Some rights
 * reserved. This work is licensed under the terms of the MIT license
 * which can be found in the root directory of this project.
 */

package software.hibiscus.doctorwhomod.common.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TardisDoorBlock extends Block {
    protected static final VoxelShape NORTH_AABB = Block.box(0.0, 0.0, 0.0, 0.0, 0.0, 0.0D);
    protected static final VoxelShape SOUTH_AABB = Block.box(0.0, 0.0, 0.0, 0.0, 0.0, 0.0D);
    protected static final VoxelShape EAST_AABB = Block.box(0.0, 0.0, 0.0, 0.0, 0.0, 0.0D);
    protected static final VoxelShape WEST_AABB = Block.box(0.0, 0.0, 0.0, 0.0, 0.0, 0.0D);

    public TardisDoorBlock(Properties arg0) {
        super(arg0);
    }
}
