package ponchisaosserver.duckdns.org.blanchiniiland3.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Player;

public class onplayerjoin implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){

        Player player = event.getPlayer();
        String name = player.getDisplayName();

        player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fBienvenido al Servidor");
        if (name.equals("Blanchinii")){
            event.setJoinMessage("§7[§c§lBLANCHINIILAND§7] §b» §eBlanchinii §fha entrado al servidor");

            ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
            String command1 = "title @a times 20 80 20";
            String command2 = "title @a subtitle [\"\",{\"text\":\"ha entrado al \",\"color\":\"yellow\"},{\"text\":\"servidor\",\"color\":\"red\"}]";
            String command3 = "title @a title {\"text\":\"Blanchinii \",\"color\":\"aqua\"}";
            Bukkit.dispatchCommand(console, command1);
            Bukkit.dispatchCommand(console, command2);
            Bukkit.dispatchCommand(console, command3);
        }
        else {
            event.setJoinMessage("§7[§c§lBLANCHINIILAND§7] §b» "+ ChatColor.YELLOW + player.getDisplayName() + ChatColor.WHITE + " ha entrado al servidor");
        }
    }

}
