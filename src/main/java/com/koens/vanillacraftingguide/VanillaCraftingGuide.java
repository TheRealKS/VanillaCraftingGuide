package com.koens.vanillacraftingguide;

import com.koens.vanillacraftingguide.commands.SearchCommand;
import com.koens.vanillacraftingguide.util.Logger;
import net.minecraft.server.v1_10_R1.NBTTagCompound;
import net.minecraft.server.v1_10_R1.NBTTagList;
import org.bukkit.Material;
import org.bukkit.craftbukkit.v1_10_R1.inventory.CraftItemStack;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public final class VanillaCraftingGuide extends JavaPlugin {

    private Logger logger;

    @Override
    public void onEnable() {
        logger = new Logger(this);
        logger.info("Enabled!");
        getCommand("cg").setExecutor(new SearchCommand());
    }

    @Override
    public void onDisable() {

    }

    private void addGuideRecipe() {
        ItemStack book = new ItemStack(Material.BOOK_AND_QUILL);
        book.getItemMeta().setDisplayName("Crafting Guide");
        ShapelessRecipe guiderecipe = new ShapelessRecipe(book);
        guiderecipe.addIngredient(Material.BOOK);
        guiderecipe.addIngredient(Material.WORKBENCH);
        getServer().addRecipe(guiderecipe);
    }
    private void addTierIBookshelfRecipe() {
        ItemStack shelf = new ItemStack(Material.BOOKSHELF);
        shelf = addGlow(shelf);
        ShapedRecipe shelfrecipe = new ShapedRecipe(shelf);
        shelfrecipe.shape("bbb", "bcb", "bbb");
        shelfrecipe.setIngredient('b', Material.BOOK);
        shelfrecipe.setIngredient('c', Material.WORKBENCH);
        getServer().addRecipe(shelfrecipe);
    }
    private void addTierIIBookshelfRecipe() {
        ItemStack shelf = new ItemStack(Material.BOOKSHELF);
        shelf = addGlow(shelf);
        ShapedRecipe shelfrecipe = new ShapedRecipe(shelf);
        shelfrecipe.shape("ggg", "gdg", "ggg");
        shelfrecipe.setIngredient('g', MaterialData)
    }

    @NotNull
    public static ItemStack addGlow(ItemStack item){
        net.minecraft.server.v1_10_R1.ItemStack nmsStack = CraftItemStack.asNMSCopy(item);
        NBTTagCompound tag = null;
        if (!nmsStack.hasTag()) {
            tag = new NBTTagCompound();
            nmsStack.setTag(tag);
        }
        if (tag == null) tag = nmsStack.getTag();
        NBTTagList ench = new NBTTagList();
        tag.set("ench", ench);
        nmsStack.setTag(tag);
        return CraftItemStack.asCraftMirror(nmsStack);
    }

}
