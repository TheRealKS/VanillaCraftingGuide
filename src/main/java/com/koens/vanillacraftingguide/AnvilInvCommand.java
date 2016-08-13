package com.koens.vanillacraftingguide;

import com.koens.vanillacraftingguide.util.Anvil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AnvilInvCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player)
        Anvil.openAnvilInventory((Player) sender);
        return true;
    }
}
