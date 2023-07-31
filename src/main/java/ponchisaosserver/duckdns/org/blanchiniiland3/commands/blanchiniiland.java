package ponchisaosserver.duckdns.org.blanchiniiland3.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import ponchisaosserver.duckdns.org.blanchiniiland3.Blanchiniiland3;

import java.io.File;
import java.io.IOException;

public class blanchiniiland implements CommandExecutor {

    private final Blanchiniiland3 plugin;

    public blanchiniiland(Blanchiniiland3 plugin) {
        this.plugin = plugin;
    }

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
                        player.sendMessage("- §e/blanchiniiland info: §fTe muestra la información sobre el plugin");
                        player.sendMessage("- §e/blanchiniiland muteall: §fte permite mutear/desmutear a todo el mundo");
                        player.sendMessage("- §e/blanchiniiland enchants: §fVerás la información necesaria para saber como encantar en la mesa de encantamientos");
                        player.sendMessage("- §e/blanchiniiland help: §fel menu que estás viendo ahora");
                    } else if (!player.hasPermission("blanchiniiland.muteall")) {
                        player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fBienvenido a la §eayuda §f del Plugin §cBlanchiniiland 3§f, los comandos que tienes disponibles son:");
                        player.sendMessage("- §e/info: §fTe muestra la información sobre el plugin");
                        player.sendMessage("- §e/blanchiniiland enchants: §fVerás la información necesaria para saber como encantar en la mesa de encantamientos");
                        player.sendMessage("- §e/help: §fel menu que estás viendo ahora");
                    }
                }
                else if (word_info.equals("enchants")) {
                    player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fBienvenido a la §eayuda §f de los §bencantamientos §f para encantar necesitas:");
                    player.sendMessage("- §5§lGrimorio Rúnico§f, para conseguir esto deberás §bunir los diferentes §bfragmentos.");
                    player.sendMessage("Una vez tengas el §5§lGrimorio Rúnico §fcrafteado, deberás ponerlo en el primer slot de tu inventario.");
                    player.sendMessage("Y solo queda usar §bla mesa de encantamientos §fcomo de costumbre, cuando encantes se te consumirá el §5§lGrimorio §fasí que §c¡Recuerda §eusarlo con cabeza y no malgastar §5§lGrimorios §eque no son faciles de conseguir!");
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
                            FileConfiguration configlistener = YamlConfiguration.loadConfiguration(new File(plugin.getDataFolder(), "Config.yml"));
                            Boolean muted = configlistener.getBoolean("Enabled");

                            if (muted) {
                                player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §c¡Esta opción ya está habilitada!");
                                return true;
                            }

                            FileConfiguration config = plugin.getConfig();
                            config.set("Enabled", true);
                            try {
                                config.save(new File(plugin.getDataFolder(), "Config.yml"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fAhora nadie puede hablar");
                        }
                        else if (selection_mute.equals("off")) {
                            FileConfiguration configlistener = YamlConfiguration.loadConfiguration(new File(plugin.getDataFolder(), "Config.yml"));
                            Boolean muted = configlistener.getBoolean("Enabled");

                            if (!muted) {
                                player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §c¡Esta opción ya está deshabilitada!");
                                return true;
                            }

                            FileConfiguration config = plugin.getConfig();
                            config.set("Enabled", false);
                            try {
                                config.save(new File(plugin.getDataFolder(), "Config.yml"));
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
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
