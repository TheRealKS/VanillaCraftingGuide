package com.koens.vanillacraftingguide.util;

import net.minecraft.server.v1_10_R1.ChatMessage;
import net.minecraft.server.v1_10_R1.EntityPlayer;
import net.minecraft.server.v1_10_R1.PacketPlayOutOpenWindow;
import org.bukkit.craftbukkit.v1_10_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

/**
 * Created by koens on 13-8-2016.
 */
public class Anvil {

    public static void openAnvilInventory(final Player player) {

        EntityPlayer entityPlayer = ((CraftPlayer) player).getHandle();
        FakeAnvil fakeAnvil = new FakeAnvil(entityPlayer);
        int containerId = entityPlayer.nextContainerCounter();

        ((CraftPlayer) player).getHandle().playerConnection.sendPacket(new PacketPlayOutOpenWindow(containerId, "minecraft:anvil", new ChatMessage("Repairing", new Object[]{}), 0));

        entityPlayer.activeContainer = fakeAnvil;
        entityPlayer.activeContainer.windowId = containerId;
        entityPlayer.activeContainer.addSlotListener(entityPlayer);
        entityPlayer.activeContainer = fakeAnvil;
        entityPlayer.activeContainer.windowId = containerId;

        Inventory inv = fakeAnvil.getBukkitView().getTopInventory();


    }
}
