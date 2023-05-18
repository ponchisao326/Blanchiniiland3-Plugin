package ponchisaosserver.duckdns.org.blanchiniiland3.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;

public class goldtoolscraft implements Listener {

    @EventHandler
    public void CraftItemEvent(CraftItemEvent event){
        //Variables
        ItemStack recipe = event.getRecipe().getResult();
        Player player = (Player) event.getWhoClicked();

        if (recipe.equals(new ItemStack(Material.GOLDEN_AXE))) { //If the Item is a Golden Axe
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §f¿En serio? ¿!De oro?! mira que hay materiales eh..."); //Send a Message to the Player who crafted
        }
        else if (recipe.equals(new ItemStack(Material.GOLDEN_SWORD))) { //If the Item is a Golder Sword
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §f¿En serio? ¿!De oro?! mira que hay materiales eh..."); //Send a Message to the Player who crafted

        }
        else if (recipe.equals(new ItemStack(Material.GOLDEN_SHOVEL))) { //If the Item is a Golder Shovel
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §f¿En serio? ¿!De oro?! mira que hay materiales eh..."); //Send a Message to the Player who crafted

        }
        else if (recipe.equals(new ItemStack(Material.GOLDEN_PICKAXE))) { //If the Item is a Golder Pickaxe
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §f¿En serio? ¿!De oro?! mira que hay materiales eh..."); //Send a Message to the Player who crafted

        }
        else if (recipe.equals(new ItemStack(Material.GOLDEN_HELMET))) { //If the Item is a Golder Helmet
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §f¿En serio? ¿!De oro?! mira que hay materiales eh..."); //Send a Message to the Player who crafted

        }
        else if (recipe.equals(new ItemStack(Material.GOLDEN_CHESTPLATE))) { //If the Item is a Golder Chestplate
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §f¿En serio? ¿!De oro?! mira que hay materiales eh..."); //Send a Message to the Player who crafted

        }
        else if (recipe.equals(new ItemStack(Material.GOLDEN_LEGGINGS))) { //If the Item is a Golder Leggins
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §f¿En serio? ¿!De oro?! mira que hay materiales eh..."); //Send a Message to the Player who crafted

        }
        else if (recipe.equals(new ItemStack(Material.GOLDEN_BOOTS))) { //If the Item is a Golder Boots
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §f¿En serio? ¿!De oro?! mira que hay materiales eh..."); //Send a Message to the Player who crafted

        }
        else if (recipe.equals(new ItemStack(Material.GOLDEN_HOE))) { //If the Item is a Golder Hoe
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §f¿En serio? ¿!De oro?! mira que hay materiales eh..."); //Send a Message to the Player who crafted

        }
    }
}
