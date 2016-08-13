package com.koens.vanillacraftingguide.commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class SearchCommand implements CommandExecutor {

    private List<ItemStack> results = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (args.length > 0) {
                if (!args[0].equalsIgnoreCase("search")) {
                    return true;
                }
                String searchterm = args[1];
                for (Material m : Material.values()) {
                    if (m.name().contains(searchterm)) {
                        ItemStack result = new ItemStack(m);
                        results.add(result);
                    }
                }
                Inventory inv = Bukkit.createInventory(p, InventoryType.CHEST);
                inv.setContents(results.toArray(new ItemStack[results.size()]));
                p.openInventory(inv);
                inv.clear();
                results.clear();
            }
        }
        return true;
    }
}
