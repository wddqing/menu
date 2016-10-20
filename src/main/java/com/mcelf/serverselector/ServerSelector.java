package com.mcelf.serverselector;

import com.mcelf.serverselector.command.ServerListCommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;


public final class ServerSelector extends JavaPlugin {



    @Override
    public void onEnable() {


        //register command
        this.registerCommand();
    }

    @Override
    public void onDisable() {

    }

    private void registerCommand() {
        this.getCommand("serverlist").setExecutor(new ServerListCommandExecutor(this));
    }


}
