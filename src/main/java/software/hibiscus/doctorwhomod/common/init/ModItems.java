/*
 * Copyright (C), 2024 Hibiscus Software and contributors. Some rights
 * reserved. This work is licensed under the terms of the MIT license
 * which can be found in the root directory of this project.
 */

package software.hibiscus.doctorwhomod.common.init;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import software.hibiscus.doctorwhomod.DoctorWhoMod;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(DoctorWhoMod.MOD_ID);

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
