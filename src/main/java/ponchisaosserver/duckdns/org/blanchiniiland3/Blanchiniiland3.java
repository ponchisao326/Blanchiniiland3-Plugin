package ponchisaosserver.duckdns.org.blanchiniiland3;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import ponchisaosserver.duckdns.org.blanchiniiland3.commands.blanchiniiland;
import ponchisaosserver.duckdns.org.blanchiniiland3.completers.blanchiniilandcompleter;
import ponchisaosserver.duckdns.org.blanchiniiland3.listeners.enchant;
import ponchisaosserver.duckdns.org.blanchiniiland3.listeners.goldtoolscraft;
import ponchisaosserver.duckdns.org.blanchiniiland3.listeners.mute;
import ponchisaosserver.duckdns.org.blanchiniiland3.listeners.onplayerjoin;

import java.io.File;
import java.util.logging.Logger;

//Things useful for the future:

// int min = 1; // Minimum value of range
// int max = 10;// Maximum value of range
// int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);

public final class Blanchiniiland3 extends JavaPlugin implements Listener {

    private FileConfiguration config;
    public String rutaConfig;
    private static Logger logger;

    @Override
    public void onEnable() {
        logger = getLogger();
        // Plugin startup logic
        logger.info("The plugin has started!");
        registerConfig();
        getServer().getPluginManager().registerEvents(new onplayerjoin(), this);
        getServer().getPluginManager().registerEvents(new goldtoolscraft(), this);
        getServer().getPluginManager().registerEvents(new mute(this), this);
        getServer().getPluginManager().registerEvents(new enchant(), this);
        getCommand("blanchiniiland").setExecutor(new blanchiniiland(this));
        getCommand("blanchiniiland").setTabCompleter(new blanchiniilandcompleter());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        logger.info("The plugin has been disabled!");
    }

    public void registerConfig() {
        File configFile = new File(this.getDataFolder(), "config.yml");
        rutaConfig = configFile.getPath();
        if (!configFile.exists()) {
            this.saveResource("config.yml", false); // Guarda la configuración predeterminada
        }
        config = YamlConfiguration.loadConfiguration(configFile); // Carga la configuración desde el archivo
    }

}
