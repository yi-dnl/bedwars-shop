package de.lecuutex.bedwars.utils;

import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

@Getter
public enum ItemsEnum {
    SANDSTONE(11, new ItemBuilder(Material.SANDSTONE).setAmount(2).build(), 1, PriceEnum.BRONZE, CategoryEnum.BLOCKS),
    ENDSTONE(12, new ItemBuilder(Material.ENDER_STONE).build(), 8, PriceEnum.BRONZE, CategoryEnum.BLOCKS),
    IRONBLOCK(13, new ItemBuilder(Material.IRON_BLOCK).build(), 3, PriceEnum.IRON, CategoryEnum.BLOCKS),
    GLASS(14, new ItemBuilder(Material.GLASS).build(), 4, PriceEnum.BRONZE, CategoryEnum.BLOCKS),
    GLOWSTONE(15, new ItemBuilder(Material.GLOWSTONE).build(), 4, PriceEnum.BRONZE, CategoryEnum.BLOCKS),
    HELMET(10, new ItemBuilder(Material.LEATHER_HELMET).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1).addEnchantment(Enchantment.DURABILITY, 1).setName("§7Lederhelm").build(), 1, PriceEnum.BRONZE, CategoryEnum.ARMOR),
    LEGGINGS(11, new ItemBuilder(Material.LEATHER_LEGGINGS).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1).addEnchantment(Enchantment.DURABILITY, 1).setName("§7Lederhose").build(), 1, PriceEnum.BRONZE, CategoryEnum.ARMOR),
    BOOTS(12, new ItemBuilder(Material.LEATHER_BOOTS).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1).addEnchantment(Enchantment.DURABILITY, 1).setName("§7Lederschuhe").build(), 1, PriceEnum.BRONZE, CategoryEnum.ARMOR),
    CHESTPLATE_I(14, new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1).addEnchantment(Enchantment.DURABILITY, 1).setName("§7Brustpanzer I").build(), 1, PriceEnum.IRON, CategoryEnum.ARMOR),
    CHESTPLATE_II(15, new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2).addEnchantment(Enchantment.DURABILITY, 1).setName("§7Brustpanzer II").build(), 3, PriceEnum.IRON, CategoryEnum.ARMOR),
    CHESTPLATE_III(16, new ItemBuilder(Material.CHAINMAIL_CHESTPLATE).addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3).addEnchantment(Enchantment.DURABILITY, 1).setName("§7Brustpanzer III").build(), 7, PriceEnum.IRON, CategoryEnum.ARMOR),
    WOODEN_PICKAXE(12, new ItemBuilder(Material.WOOD_PICKAXE).addEnchantment(Enchantment.DIG_SPEED, 1).addEnchantment(Enchantment.DURABILITY, 1).setName("§7Holzspitzhacke").build(), 4, PriceEnum.BRONZE, CategoryEnum.PICKAXE),
    STONE_PICKAXE(13, new ItemBuilder(Material.STONE_PICKAXE).addEnchantment(Enchantment.DIG_SPEED, 2).addEnchantment(Enchantment.DURABILITY, 1).setName("§7Steinspitzhacke").build(), 2, PriceEnum.IRON, CategoryEnum.PICKAXE),
    IRON_PICKAXE(14, new ItemBuilder(Material.IRON_PICKAXE).addEnchantment(Enchantment.DIG_SPEED, 3).addEnchantment(Enchantment.DURABILITY, 1).setName("§7Eisenspitzhacke").build(), 1, PriceEnum.GOLD, CategoryEnum.PICKAXE),
    STICK(11, new ItemBuilder(Material.STICK).addEnchantment(Enchantment.KNOCKBACK, 1).setName("§7Stock").build(), 8, PriceEnum.BRONZE, CategoryEnum.SWORD),
    GOLDEN_SWORD_I(12, new ItemBuilder(Material.GOLD_SWORD).addEnchantment(Enchantment.DAMAGE_ALL, 1).addEnchantment(Enchantment.DURABILITY, 1).setName("§7Goldschwert I").build(), 1, PriceEnum.IRON, CategoryEnum.SWORD),
    GOLDEN_SWORD_II(13, new ItemBuilder(Material.GOLD_SWORD).addEnchantment(Enchantment.DAMAGE_ALL, 2).addEnchantment(Enchantment.DURABILITY, 1).setName("§7Goldschwert II").build(), 3, PriceEnum.IRON, CategoryEnum.SWORD),
    GOLDEN_SWORD_III(14, new ItemBuilder(Material.GOLD_SWORD).addEnchantment(Enchantment.DAMAGE_ALL, 3).addEnchantment(Enchantment.DURABILITY, 1).setName("§7Goldschwert III").build(), 7, PriceEnum.IRON, CategoryEnum.SWORD),
    IRON_SWORD(15, new ItemBuilder(Material.IRON_SWORD).addEnchantment(Enchantment.DAMAGE_ALL, 2).addEnchantment(Enchantment.DURABILITY, 1).addEnchantment(Enchantment.KNOCKBACK, 1).setName("§7Eisenschwert").build(), 5, PriceEnum.GOLD, CategoryEnum.SWORD),
    BOW_I(11, new ItemBuilder(Material.BOW).addEnchantment(Enchantment.ARROW_DAMAGE, 1).setName("§7Bogen I").build(), 3, PriceEnum.GOLD, CategoryEnum.BOW),
    BOW_II(12, new ItemBuilder(Material.BOW).addEnchantment(Enchantment.ARROW_DAMAGE, 2).setName("§7Bogen II").build(), 7, PriceEnum.GOLD, CategoryEnum.BOW),
    BOW_III(13, new ItemBuilder(Material.BOW).addEnchantment(Enchantment.ARROW_DAMAGE, 3).addEnchantment(Enchantment.ARROW_KNOCKBACK, 1).setName("§7Bogen III").build(), 13, PriceEnum.GOLD, CategoryEnum.BOW),
    ARROW(15, new ItemBuilder(Material.ARROW).setName("§7Pfeil").build(), 3, PriceEnum.IRON, CategoryEnum.BOW),
    APPLE(11, new ItemBuilder(Material.APPLE).setName("§7Apfel").build(), 1, PriceEnum.BRONZE, CategoryEnum.FOOD),
    STEAK(12, new ItemBuilder(Material.COOKED_BEEF).setName("§7Steak").build(), 2, PriceEnum.BRONZE, CategoryEnum.FOOD),
    CAKE(13, new ItemBuilder(Material.CAKE).setName("§7Kuchen").build(), 1, PriceEnum.IRON, CategoryEnum.FOOD),
    GOLDEN_APPLE(15, new ItemBuilder(Material.GOLDEN_APPLE).setName("§7Goldener Apfel").build(), 2, PriceEnum.GOLD, CategoryEnum.FOOD),
    ENDER_CHEST(14, new ItemBuilder(Material.ENDER_CHEST).build(), 1, PriceEnum.GOLD, CategoryEnum.CHEST),
    CHEST(12, new ItemBuilder(Material.CHEST).build(), 1, PriceEnum.IRON, CategoryEnum.CHEST),
    SPEED_POTION(10, new ItemBuilder(Material.POTION, 1, 8226).setName("§7Schnelligkeit II").addItemFlag(ItemFlag.HIDE_POTION_EFFECTS).build(), 7, PriceEnum.IRON, CategoryEnum.POTION),
    HEAL_POTION_I(11, new ItemBuilder(Material.POTION, 1, 8261).setName("§7Heilung I").addItemFlag(ItemFlag.HIDE_POTION_EFFECTS).build(), 3, PriceEnum.IRON, CategoryEnum.POTION),
    HEAL_POTION_II(12, new ItemBuilder(Material.POTION, 1, 8229).setName("§7Heilung II").addItemFlag(ItemFlag.HIDE_POTION_EFFECTS).build(), 5, PriceEnum.IRON, CategoryEnum.POTION),
    HEALTH_POTION(14, new ItemBuilder(Material.POTION, 1, 8238).setName("§7Leben").addItemFlag(ItemFlag.HIDE_POTION_EFFECTS).build(), 10, PriceEnum.IRON, CategoryEnum.POTION),
    REGEN_POTION(15, new ItemBuilder(Material.POTION, 1, 8225).setName("§7Regeneration 2").addItemFlag(ItemFlag.HIDE_POTION_EFFECTS).build(), 7, PriceEnum.IRON, CategoryEnum.POTION),
    STRENGTH_POTION(16, new ItemBuilder(Material.POTION, 1, 8265).setName("§7Stärke I").addItemFlag(ItemFlag.HIDE_POTION_EFFECTS).build(), 8, PriceEnum.GOLD, CategoryEnum.POTION),
    LADDER(9, new ItemBuilder(Material.LADDER, 1, 8225).setName("§7Leiter").build(), 1, PriceEnum.BRONZE, CategoryEnum.ELSE),
    WEB(10, new ItemBuilder(Material.WEB).setName("§7Spinnenweben").build(), 16, PriceEnum.BRONZE, CategoryEnum.ELSE),
    ROD(11, new ItemBuilder(Material.FISHING_ROD).setName("§7Angel").build(), 5, PriceEnum.IRON, CategoryEnum.ELSE),
    TELEPORTER(12, new ItemBuilder(Material.SULPHUR).setName("§7Teleporter").build(), 3, PriceEnum.IRON, CategoryEnum.ELSE),
    FLINT_AND_STEEL(13, new ItemBuilder(Material.FLINT_AND_STEEL).setName("§7Feuerzeug").build(), 7, PriceEnum.IRON, CategoryEnum.ELSE),
    TNT(14, new ItemBuilder(Material.TNT).setName("§7TNT").build(), 3, PriceEnum.GOLD, CategoryEnum.ELSE),
    SHEEP(15, new ItemBuilder(Material.MONSTER_EGG, 1, 91).setName("§7TNT-Schaf").build(), 64, PriceEnum.BRONZE, CategoryEnum.ELSE),
    ENDER_PEARL(16, new ItemBuilder(Material.ENDER_PEARL).setName("§7Enderperle").build(), 13, PriceEnum.GOLD, CategoryEnum.ELSE),
    BLAZE_ROD(17, new ItemBuilder(Material.BLAZE_ROD).setName("§7Rettungsplattform").build(), 3, PriceEnum.GOLD, CategoryEnum.ELSE);

    private ItemStack item;
    private PriceEnum type;
    private CategoryEnum category;
    private int slot;
    private int price;

    ItemsEnum(int slot, ItemStack item, int price, PriceEnum type, CategoryEnum category) {

        this.slot = slot;
        this.category = category;
        this.item = item;
        this.type = type;
        this.price = price;
    }

    public static ItemStack getItem(ItemsEnum itemsEnum) {
        ItemStack item = new ItemBuilder(itemsEnum.getItem()).setLore("§a§l" + itemsEnum.getPrice() + " " + itemsEnum.getType().getName()).build();
        return item;
    }

    public static ItemsEnum getByItems(ItemStack itemStack) {
        ItemsEnum itemsEnum = null;

        for (ItemsEnum value : ItemsEnum.values()) {
            if (value.getItem().getType() == itemStack.getType()) {
                itemsEnum = value;
            }
        }

        return itemsEnum;
    }
}
