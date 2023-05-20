package ponchisaosserver.duckdns.org.blanchiniiland3.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class blanchiniiland implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player player) {
            if (args.length == 0) {
                player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fNo has especificado que comando deseas ejecutar!");
                player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §c/help para mostrar la ayuda");
            }
            else if (args.length == 1) {
                String word_info = args[0];
                if (word_info.equals("info")) { //Info Command
                    player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fBienvenido a la info, este es un plugin desarrollado por §ePonchisao326 §fpara el servidor de §eBlanchiniiland 3. §fSi necesitas ayuda sobre mi, usa /blanchiniiland help");
                }
                else if (word_info.equals("help")) {
                    if (player.hasPermission("blanchiniiland.muteall")) {
                        player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fBienvenido a la §eayuda §f del Plugin §cBlanchiniiland 3§f, los comandos que tienes disponibles son:");
                        player.sendMessage("- §e/info: §fTe muestra la información sobre el plugin");
                        player.sendMessage("- §e/muteall: §fte permite mutear/desmutear a todo el mundo");
                        player.sendMessage("- §e/help: §fel menu que estás viendo ahora");
                    } else if (!player.hasPermission("blanchiniiland.muteall")) {
                        player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fBienvenido a la §eayuda §f del Plugin §cBlanchiniiland 3§f, los comandos que tienes disponibles son:");
                        player.sendMessage("- §e/info: §fTe muestra la información sobre el plugin");
                        player.sendMessage("- §e/help: §fel menu que estás viendo ahora");
                    }
                }
                else {
                    player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fNo has especificado que comando deseas ejecutar!");
                    player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §c/help para mostrar la ayuda");
                }
            }
            else {
                String word = args[0]; //Muteall Command
                if (word.equals("muteall")) {
                    if (!player.hasPermission("blanchiniiland.muteall")) {
                        player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §cNo tienes los permisos necesarios");
                    }
                    else {
                        String selection_mute = args[1];
                        if (selection_mute.equals("on")) {
                            ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
                            String main_command = "lp group default permission set blanchiniiland.cantalk false";
                            Bukkit.dispatchCommand(console, main_command);
                            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fAhora nadie puede hablar");
                        }
                        else if (selection_mute.equals("off")) {
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
            }
        }
        return true;
    }

}
