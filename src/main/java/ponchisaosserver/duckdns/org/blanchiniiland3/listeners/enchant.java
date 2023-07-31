package ponchisaosserver.duckdns.org.blanchiniiland3.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.EnchantingTable;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.inventory.ItemStack;

import java.net.ServerSocket;
import java.net.http.WebSocket;
import java.util.logging.Logger;
import static org.bukkit.Bukkit.getLogger;

public class enchant implements Listener {
    private static Logger logger;

    @EventHandler
    public void EnchantItem(EnchantItemEvent event) {
        logger = getLogger();
        Player player = (Player) event.getEnchanter();
        String item = String.valueOf(player.getInventory().getItem(0));
        //System.out.println(player.getInventory().getItem(0));
        //System.out.println(item);
        if (item.startsWith("ItemStack{PAPER x 1, UNSPECIFIC_META:{meta-type=UNSPECIFIC, display-name={\"extra\":[{\"italic\":false,\"color\":\"gold\",\"text\":\"Grimorio rúnico\"}],\"text\":\"\"},")) {
            ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
            ItemStack grimorio = player.getInventory().getItem(0);
            grimorio.setAmount(0);
            logger.info("El Grimonio de " + player.getName() + "ha sido eliminado");
        }
        else {
            event.setCancelled(true);
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §c¡Te falta el §eGrimorio Rúnico!");
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §f¡En caso de que tengas un Grimorio usa /blanchiniiland enchants para mas información!");
        }
    }
    }

