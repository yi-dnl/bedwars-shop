package de.lecuutex.bedwars.listener;

import de.lecuutex.bedwars.Bedwars;
import de.lecuutex.bedwars.utils.CategoryEnum;
import de.lecuutex.bedwars.utils.ItemsEnum;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class InventoryClickListener implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent event) {

        Inventory inventory = event.getClickedInventory();
        ItemStack item = event.getCurrentItem();
        int slot = event.getRawSlot();
        Player player = (Player) event.getWhoClicked();

        event.setCancelled(false);

        if (inventory == null) return;
        if (!item.hasItemMeta()) return;
        if (inventory == player.getOpenInventory().getTopInventory()) event.setCancelled(true);

        for (CategoryEnum value : CategoryEnum.values()) {
            if (value.getItem().getItemMeta().getDisplayName().equals(item.getItemMeta().getDisplayName())) {
                player.openInventory(Bedwars.getInstance().getInventoryHandler().shopInventory(value));
            }
        }

        if (slot >= 9 && slot <= 17) {
            if (event.getClick().isShiftClick()) {
                addStack(player, ItemsEnum.getByItems(item).getItem());
            } else {
                addItem(player, ItemsEnum.getByItems(item).getItem());
            }
        }
    }

    //has space in inventory
    private boolean isEmpty(Player player, ItemStack item) {
        boolean empty = false;

        for (int i = 0; i < player.getInventory().getSize(); i++) {
            if (player.getInventory().getItem(i) == null) {
                empty = true;
                break;

            } else if (player.getInventory().getItem(i).getType() == item.getType()) {
                if (player.getInventory().getItem(i).getAmount() < player.getInventory().getItem(i).getMaxStackSize()) {
                    empty = true;
                }
            }
        }

        return empty;
    }

    //Add item to the inventory
    private void addItem(Player player, ItemStack itemStack) {
        if (isEmpty(player, itemStack)) {
            if (!haveEnough(player.getInventory(), ItemsEnum.getByItems(itemStack))) return;
            if (itemStack.getType() == Material.STAINED_GLASS_PANE) return;

            boolean neededStack = true;
            int currentSlot = player.getInventory().firstEmpty();

            player.playSound(player.getLocation(), Sound.CLICK, 1, 1);

            for (int i = 0; i < player.getInventory().getSize(); i++) {
                ItemStack currentItem = player.getInventory().getItem(i);

                if (currentItem == null) continue;
                if (currentItem.getType() != itemStack.getType()) continue;

                if (itemStack.getMaxStackSize() - currentItem.getAmount() >= itemStack.getAmount()) {
                    neededStack = false;
                    currentSlot = i;
                }
            }

            if (neededStack) {
                player.getInventory().setItem(player.getInventory().firstEmpty(), itemStack);
            } else {
                player.getInventory().getItem(currentSlot).setAmount(player.getInventory().getItem(currentSlot).getAmount() + itemStack.getAmount());
            }
        }
    }


    //haveEnoughCurrency
    private boolean haveEnough(Inventory inventory, ItemsEnum itemsEnum) {
        for (int i = 0; i < inventory.getSize(); i++) {
            if (inventory.getItem(i) == null) continue;
            if (inventory.getItem(i).getType() == itemsEnum.getType().getMaterial()) {
                if (inventory.getItem(i).getAmount() >= itemsEnum.getPrice()) {

                    //removeCurrency
                    if (inventory.getItem(i).getAmount() == itemsEnum.getPrice()) {
                        inventory.setItem(i, null);
                        return true;
                    } else {
                        inventory.getItem(i).setAmount(inventory.getItem(i).getAmount() - itemsEnum.getPrice());
                        return true;
                    }

                }
            }
        }
        return false;
    }

    //Add a stack of items to the inventory

    private void addStack(Player player, ItemStack itemStack) {
        int currentAmount = 0;

        for (int i = 0; i < player.getInventory().getSize(); i++) {
            if (player.getInventory().getItem(i) == null) continue;

            if (player.getInventory().getItem(i).getType() == itemStack.getType()) {
                if (itemStack.getMaxStackSize() - player.getInventory().getItem(i).getAmount() >= itemStack.getAmount())
                    currentAmount = player.getInventory().getItem(i).getAmount();
                break;
            }
        }

        for (int i = 0; i < (itemStack.getMaxStackSize() - currentAmount) / itemStack.getAmount(); i++) {
            addItem(player, itemStack);
        }
    }
}
