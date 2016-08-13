package com.koens.vanillacraftingguide.util;


import com.koens.vanillacraftingguide.VanillaCraftingGuide;

public class Logger {

    private final VanillaCraftingGuide plugin;

    public Logger(VanillaCraftingGuide p) {
        this.plugin = p;
    }

    public void info(String msg) {
        plugin.getLogger().info(msg);
    }
}
