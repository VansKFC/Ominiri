package combat.main; //Package location

import org.bukkit.attribute.Attribute; //Bukkit Imports
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
//Main clas
public class Main implements Listener {
  @EventHandler //Tag as event handler.
  public void onJoin(PlayerJoinEvent event) { //Make code run on join event.
    Player player = event.getPlayer(); //Define player
    player.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(16.0D); //Set attack speed attribute. 16+ to disable hit cooldown.
  }
}
