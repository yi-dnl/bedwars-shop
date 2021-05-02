package de.lecuutex.bedwars.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class ItemBuilder {
    private ItemStack item;
    private ItemMeta meta;

    public ItemBuilder(ItemStack itemStack) {
        this.item = itemStack.clone();
        meta = item.getItemMeta();
    }

    public ItemBuilder(Material material) {
        this.item = new ItemStack(material);
        meta = item.getItemMeta();
    }

    public ItemBuilder(Material material, int amount) {
        this.item = new ItemStack(material, amount);
        meta = item.getItemMeta();
    }

    public ItemBuilder(Material material, int amount, int durability) {
        this.item = new ItemStack(material, amount, (short) durability);
        meta = item.getItemMeta();
    }

    public ItemBuilder setName(String name) {
        meta.setDisplayName(name);
        return this;
    }

    public ItemBuilder setAmount(int amount) {
        item.setAmount(amount);
        return this;
    }

    public ItemBuilder addEnchantment(Enchantment enchantment, int power) {
        meta.addEnchant(enchantment, power, true);
        return this;
    }

    public ItemBuilder setLore(String... text) {
        meta.setLore(Arrays.asList(text));
        return this;
    }

    public ItemBuilder addItemFlag(ItemFlag flag) {
        meta.addItemFlags(flag);
        return this;
    }

    public ItemStack build() {
        item.setItemMeta(meta);
        return item;
    }
}
