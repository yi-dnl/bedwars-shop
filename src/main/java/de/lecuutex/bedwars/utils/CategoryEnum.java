package de.lecuutex.bedwars.utils;

import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@Getter
public enum CategoryEnum {
    BLOCKS("§cBlöcke",new ItemBuilder(Material.SANDSTONE).setName("§eBlöcke").build()),
    ARMOR("§cRüstungen", new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).setName("§eRüstungen").build()),
    PICKAXE("§cSpitzhacken",new ItemBuilder(Material.IRON_PICKAXE).setName("§eSpitzhacken").build()),
    SWORD("§cSchwerter",new ItemBuilder(Material.GOLD_SWORD).setName("§eSchwerter").build()),
    BOW("§cBögen",new ItemBuilder(Material.BOW).setName("§eBögen").build()),
    FOOD("§cEssen",new ItemBuilder(Material.COOKED_BEEF).setName("§eEssen").build()),
    CHEST("§cKisten",new ItemBuilder(Material.ENDER_CHEST).setName("§eTruhen").build()),
    POTION("§cTränke",new ItemBuilder(Material.POTION).setName("§eTränke").build()),
    ELSE("§cSonstiges",new ItemBuilder(Material.SLIME_BALL).setName("§eSonstiges").build());

    private ItemStack item;
    private String title;

    CategoryEnum(String title, ItemStack item) {
        this.title = title;
        this.item = item;
    }
}
