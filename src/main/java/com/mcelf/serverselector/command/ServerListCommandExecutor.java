package com.mcelf.serverselector.command;

import com.mcelf.serverselector.ServerSelector;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

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


            return true;
        }
        return false;
    }
}
