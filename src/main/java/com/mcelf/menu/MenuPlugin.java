package com.mcelf.menu;

import com.mcelf.menu.command.MenuCommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by wddqing on 2016/10/21.
 */
public class MenuPlugin extends JavaPlugin {

    @Override
    public void onEnable() {


        this.registerCommand();
    }

    @Override
    public void onDisable() {
    }

    /**
     * register command
     */
    private void registerCommand() {
        this.getCommand("menu").setExecutor(new MenuCommandExecutor(this));
    }
}
