package ponchisaosserver.duckdns.org.blanchiniiland3.listeners;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import ponchisaosserver.duckdns.org.blanchiniiland3.Blanchiniiland3;

import java.io.File;

public class mute implements Listener {

    private final Blanchiniiland3 plugin;

    public mute(Blanchiniiland3 plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void OnChat(AsyncPlayerChatEvent event) {

        Player player = event.getPlayer();

        FileConfiguration config = YamlConfiguration.loadConfiguration(new File(plugin.getDataFolder(), "Config.yml"));
        Boolean muted = config.getBoolean("Enabled");

        if (muted) {
            if (!player.hasPermission("blanchiniiland.cantalk")) {
                player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §cno puedes hablar");
                event.setCancelled(true);
            }
        }

    }
}
