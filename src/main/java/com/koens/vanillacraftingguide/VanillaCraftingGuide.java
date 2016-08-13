package com.koens.vanillacraftingguide;

import com.koens.vanillacraftingguide.util.Logger;
import org.bukkit.plugin.java.JavaPlugin;

public final class VanillaCraftingGuide extends JavaPlugin {

    private Logger logger;

    @Override
    public void onEnable() {
        logger = new Logger(this);
        logger.info("Enabled!");
    }

    @Override
    public void onDisable() {

    }

}
