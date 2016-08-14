package com.koens.vanillacraftingguide;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AnvilInvCommand implements CommandExecutor {

    private VanillaCraftingGuide plugin;

    public AnvilInvCommand(VanillaCraftingGuide p) {
        this.plugin = p;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
        }
        return true;
    }
}
