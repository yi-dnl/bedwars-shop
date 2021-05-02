package de.lecuutex.bedwars.utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

public class InventoryHandler {

    public Inventory shopInventory(CategoryEnum categoryEnum) {
        Inventory inv = Bukkit.createInventory(null,  2*9, categoryEnum.getTitle());
        fillInventory(inv);

        for (ItemsEnum value : ItemsEnum.values()) {
            if(value.getCategory() != categoryEnum) continue;
            inv.setItem(value.getSlot(),ItemsEnum.getItem(value));
        }

        return inv;
    }

    private void fillInventory(Inventory inventory) {
        for (int i = 0; i < inventory.getSize(); i++) { inventory.setItem(i, new ItemBuilder(Material.STAINED_GLASS_PANE, 1, 7).setName(" ").build()); }

        for (int i = 0; i < CategoryEnum.values().length; i++) {
            inventory.setItem(i, CategoryEnum.values()[i].getItem());
        }
    }
}
