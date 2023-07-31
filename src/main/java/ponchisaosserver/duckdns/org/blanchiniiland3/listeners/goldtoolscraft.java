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
        //Code
        if (recipe.equals(new ItemStack(Material.GOLDEN_AXE))) { //If the Item is a Golden Axe
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §f¿En serio? ¿!De oro?! mira que hay materiales eh..."); //Send a Message to the Player who crafted
        }
        else if (recipe.equals(new ItemStack(Material.GOLDEN_SWORD))) { //If the Item is a Golder Sword
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fRealmente has crafteado eso, desgraciadamente no existe crafteo capaz de curar tu enfermedad mental, pero quizá algún mago pueda ayudarte"); //Send a Message to the Player who crafted

        }
        else if (recipe.equals(new ItemStack(Material.GOLDEN_SHOVEL))) { //If the Item is a Golder Shovel
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §f¿Eres consciente de que lo que acabas de craftear tiene la misma utilidad que la remolacha verdad? Al menos está te da algo de comer, pero lo que has hecho debería ser ilegal"); //Send a Message to the Player who crafted

        }
        else if (recipe.equals(new ItemStack(Material.GOLDEN_PICKAXE))) { //If the Item is a Golder Pickaxe
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fPerdona, creo que te has equivocado al craftear eso, siéntete libre de contactar a un administrador para que se ría de la tontería que acabas de hacer"); //Send a Message to the Player who crafted

        }
        else if (recipe.equals(new ItemStack(Material.GOLDEN_HELMET))) { //If the Item is a Golder Helmet
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §f¿Pero tú qué clase de terrorista eres? Deberías estar en busca y captura por lo contrario a fraude fiscal no se que haces, estás quitándole valor al oro ¿no has atendido a clases de economía o que? Seguro que eres murciano…"); //Send a Message to the Player who crafted

        }
        else if (recipe.equals(new ItemStack(Material.GOLDEN_CHESTPLATE))) { //If the Item is a Golder Chestplate
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fMira si vas a desperdiciar el oro así para eso dámelo a mi, la inteligencia te persigue pero tú eres más rápido"); //Send a Message to the Player who crafted

        }
        else if (recipe.equals(new ItemStack(Material.GOLDEN_LEGGINGS))) { //If the Item is a Golder Leggins
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fNo se que es mas lamentable, ver que has crafteado eso o haberte dejado entrar al servidor"); //Send a Message to the Player who crafted

        }
        else if (recipe.equals(new ItemStack(Material.GOLDEN_BOOTS))) { //If the Item is a Golder Boots
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fEnhorabuena, una vez crafteado eso queda demostrado que tienes la misma capacidad de razonamiento que un protozoo, asegúrate de exhibirlo delante de todos para no perderte una collejita"); //Send a Message to the Player who crafted

        }
        else if (recipe.equals(new ItemStack(Material.GOLDEN_HOE))) { //If the Item is a Golder Hoe
            player.sendMessage("§7[§c§lBLANCHINIILAND§7] §b» §fLo siento, pero acabar de demostrarme que eres tonto, desgraciadamente no hay vuelta atrás, sin embargo, puedes meter lo que acabas de craftear en un horno para así recuperar una pepita, es igual de inutil que lo que has crafteado"); //Send a Message to the Player who crafted

        }
    }
}
