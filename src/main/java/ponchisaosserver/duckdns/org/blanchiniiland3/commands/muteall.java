package ponchisaosserver.duckdns.org.blanchiniiland3.commands;


import ponchisaosserver.duckdns.org.blanchiniiland3.Blanchiniiland3;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.lang.module.Configuration;

public class muteall implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player player){

            if (args.length == 0) {
                player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fNo has especificado si quieres activarlo o desactivarlo!");
                player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §cUsage: /muteall <on:off>");
            }
            else {
                String word = args[0];
                if (word.equals("on")) {
                    ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                    String main_command = "lp group default permission set blanchiniiland.cantalk false";
                    Bukkit.dispatchCommand(console, main_command);
                    player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fAhora nadie puede hablar");
                } else if (word.equals("off")) {
                    ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                    String main_command = "lp group default permission set blanchiniiland.cantalk true";
                    Bukkit.dispatchCommand(console, main_command);
                    player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fAhora todos pueden hablar");
                }
                else {
                    player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §cEse no es un argumento valido!");
                }
            }



        }
        else if (sender instanceof ConsoleCommandSender){
            System.out.println("Activando comando...");
        }

        return true;
    }
}
