package ponchisaosserver.duckdns.org.blanchiniiland3.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class info implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if (sender instanceof Player player){

            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fBienvenido a la info, este es un plugin desarrollado por §ePonchisao326 §fpara el servidor de §eBlanchiniiland 3. §fSi necesitas ayuda sobre mi, usa /blanchiniiland help");
        }
        return true;
    }

}
