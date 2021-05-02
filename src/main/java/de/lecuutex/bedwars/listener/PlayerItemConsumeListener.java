package de.lecuutex.bedwars.listener;

import de.lecuutex.bedwars.utils.ItemsEnum;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PlayerItemConsumeListener implements Listener {
    @EventHandler
    public void onConsume(PlayerItemConsumeEvent event) {
        if (event.getItem().getItemMeta().getDisplayName().equals(ItemsEnum.HEALTH_POTION.getItem().getItemMeta().getDisplayName())) {
            event.setCancelled(true);
            event.getPlayer().getInventory().remove(event.getItem());

            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 15 * 20, 1, true, true));
        }

        if(event.getItem().getType() == Material.POTION) {
            event.getPlayer().getInventory().remove(Material.GLASS_BOTTLE);
        }
    }
}
