package com.mcelf.serverselector.command;

import com.mcelf.serverselector.ServerSelector;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.List;

/**
 * open server list inventory
 * Created by wddqing on 2016/10/20.
 */
public class ServerListCommandExecutor implements CommandExecutor {

    private ServerSelector selector;

    public ServerListCommandExecutor(ServerSelector selector) {
        this.selector = selector;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(sender instanceof Player) {

            Inventory inventory = Bukkit.createInventory(null,27,"test inventory");
            ItemStack item = new ItemStack(Material.WOOL,1);
            inventory.setItem(0,item);
            ((Player) sender).openInventory(inventory);
            return true;
        }
        return false;
    }
}
