package ponchisaosserver.duckdns.org.blanchiniiland3.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class mute implements Listener {
    @EventHandler
    public void OnChat(AsyncPlayerChatEvent event) {

        Player player = event.getPlayer();

        if (!player.hasPermission("blanchiniiland.cantalk")) {
            player.sendMessage("no puedes hablar");
            event.setCancelled(true);
        }

    }
}
