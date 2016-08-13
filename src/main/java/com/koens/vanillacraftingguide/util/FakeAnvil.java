package com.koens.vanillacraftingguide.util;

import net.minecraft.server.v1_10_R1.BlockPosition;
import net.minecraft.server.v1_10_R1.ContainerAnvil;
import net.minecraft.server.v1_10_R1.EntityHuman;

/**
 * Created by koens on 13-8-2016.
 */

public final class FakeAnvil extends ContainerAnvil {

    public FakeAnvil(EntityHuman entityHuman) {
        super(entityHuman.inventory, entityHuman.world, new BlockPosition(0,0,0), entityHuman);
    }


    @Override
    public boolean a(EntityHuman entityHuman) {
        return true;
    }
}