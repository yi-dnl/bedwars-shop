package de.lecuutex.bedwars;

import de.lecuutex.bedwars.commands.ShopCommand;
import de.lecuutex.bedwars.listener.InventoryClickListener;
import de.lecuutex.bedwars.listener.PlayerItemConsumeListener;
import de.lecuutex.bedwars.utils.InventoryHandler;
import de.lecuutex.bedwars.utils.ItemsEnum;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

@Setter
@Getter
public class Bedwars extends JavaPlugin {

    //TODO: Die gekaufte Lederrüstung muss geförbt werden

    private String prefix = "§cBedwars §7● §7";
    private HashMap<Integer, Location> shopLocations = new HashMap<>();
    ItemsEnum itemsEnum;
    InventoryHandler inventoryHandler;

    @Getter
    private static Bedwars instance;

    @Override
    public void onEnable() {
        instance = this;
        inventoryHandler = new InventoryHandler();

        Bukkit.getPluginManager().registerEvents(new InventoryClickListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerItemConsumeListener(), this);
        getCommand("shop").setExecutor(new ShopCommand());
    }
}
