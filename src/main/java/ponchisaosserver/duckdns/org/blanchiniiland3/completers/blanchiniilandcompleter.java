package ponchisaosserver.duckdns.org.blanchiniiland3.completers;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class blanchiniilandcompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 1) {
            List<String> arguments = new ArrayList<>();

            arguments.add("muteall");
            arguments.add("info");
            arguments.add("help");

            return arguments;
        }
        return null;
    }
}
