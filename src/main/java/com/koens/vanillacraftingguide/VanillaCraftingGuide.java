package com.koens.vanillacraftingguide;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.*;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class VanillaCraftingGuide extends JavaPlugin {

    private Map<Material, List<ItemStack>> shapedrecipes;
    private Map<Material, List<ItemStack>> shapelessrecipes;

    @Override
    public void onEnable() {
        Iterator<Recipe> allrecipes = getServer().recipeIterator();
        while (allrecipes.hasNext()) {
            Recipe recipe = allrecipes.next();
            if (recipe != null && recipe.getResult() != null) {
                if (recipe instanceof ShapedRecipe) {
                    ShapedRecipe shapedRecipe = (ShapedRecipe) recipe;

                    shapedrecipes.put(shapedRecipe.getResult(), shapedRecipe.)
                } else if (recipe instanceof ShapelessRecipe) {
                     ShapelessRecipe shapelessRecipe = (ShapelessRecipe) recipe;
                } else {
                    getLogger().warning("A recipe for item: '" + recipe.getResult().getType().toString() + "' is invalid!");
                }
            }
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
