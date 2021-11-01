package de.stormi.main;

import de.stormi.admincommands.opheal;
import de.stormi.commands.HealCommand;
import de.stormi.commands.HelpCommand;
import de.stormi.admincommands.adminhelp;
import de.stormi.commands.feedcommand;
import de.stormi.flyspeed.fly;
import de.stormi.flyspeed.flyspeed1;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("§4§lDas Plugin wurde Aktiviert");
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("shelp").setExecutor(new HelpCommand());
        getCommand("feed").setExecutor(new feedcommand());
        getCommand("adminhelp").setExecutor(new adminhelp());
        getCommand("flyspeed1").setExecutor(new flyspeed1());
        getCommand("fly").setExecutor(new fly());
        getCommand("opheal").setExecutor(new opheal());
    }
}