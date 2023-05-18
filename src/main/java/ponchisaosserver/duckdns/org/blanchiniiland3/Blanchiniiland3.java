package ponchisaosserver.duckdns.org.blanchiniiland3;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import ponchisaosserver.duckdns.org.blanchiniiland3.commands.info;
import ponchisaosserver.duckdns.org.blanchiniiland3.commands.muteall;
import ponchisaosserver.duckdns.org.blanchiniiland3.listeners.goldtoolscraft;
import ponchisaosserver.duckdns.org.blanchiniiland3.listeners.mute;
import ponchisaosserver.duckdns.org.blanchiniiland3.listeners.onplayerjoin;

//Things useful for the future:

        // int min = 1; // Minimum value of range
        // int max = 10;// Maximum value of range
        // int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);

public final class Blanchiniiland3 extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("The plugin has started!");
        getServer().getPluginManager().registerEvents(new onplayerjoin(), this);
        getServer().getPluginManager().registerEvents(new goldtoolscraft(), this);
        getServer().getPluginManager().registerEvents(new mute(), this);
        getCommand("info").setExecutor(new info());
        getCommand("muteall").setExecutor(new muteall());

        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("The plugin has been disabled!");
    }

}
