package de.lecuutex.bedwars.commands;

import de.lecuutex.bedwars.Bedwars;
import de.lecuutex.bedwars.utils.CategoryEnum;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ShopCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        Player player = (Player) sender;

        player.openInventory(Bedwars.getInstance().getInventoryHandler().shopInventory(CategoryEnum.BLOCKS));
        return true;
    }
}
