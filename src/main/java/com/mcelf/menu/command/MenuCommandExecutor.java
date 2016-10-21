package com.mcelf.menu.command;

import com.mcelf.menu.MenuPlugin;
import com.sun.org.apache.xpath.internal.functions.WrongNumberArgsException;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * Created by wddqing on 2016/10/21.
 */
public class MenuCommandExecutor implements CommandExecutor {

    private MenuPlugin plugin;

    private enum SubCommand {

        HELP("help"), OPEN("open");

        private String name;

        private SubCommand(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return String.valueOf(this.name);
        }
    }

    public MenuCommandExecutor(MenuPlugin plugin) {
        this.plugin = plugin;
    }

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        try {
            if (args.length == 0) {
                return this.help();
            } else {
                SubCommand subcmd = SubCommand.valueOf(args[0].toLowerCase());
                switch (subcmd) {
                    case HELP:
                        return this.help();
                    case OPEN:
                        return this.open();
                    default:
                        throw new WrongNumberArgsException("unknown command " + subcmd.name);
                }
            }
        } catch (WrongNumberArgsException e) {
            e.printStackTrace();
            this.plugin.getLogger().warning(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            this.plugin.getLogger().warning("Unhandled error while execute the command!");
        }

        return false;
    }

    private boolean help() {
        return false;
    }

    private boolean open() {
        return false;
    }
}
