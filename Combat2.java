  package me.code.combat; //Package location

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute; //Bukkit Imports
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
//Main class
public class Main extends JavaPlugin implements Listener {
  @EventHandler //Tag as event handler.
  public void onJoin(PlayerJoinEvent event) { //Make code run on join event.
    Player player = event.getPlayer(); //Define player
    player.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(16.0D); //Set attack speed attribute. 16+ to disable hit cooldown.
 

  }
  

  
   public void onEnable() {
	   Bukkit.getServer().getPluginManager().registerEvents(this, this);
	   
    }
   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	   Player p = (Player) sender;
	   if(cmd.getName().equalsIgnoreCase("info")) {
		   p.sendMessage(ChatColor.RED + p.getDisplayName());
		   p.sendMessage(ChatColor.GREEN + "HP: " + p.getHealth());
		   p.sendMessage(ChatColor.DARK_BLUE + "kills: " + p.getKiller());
	   }
   
	   return false;
    	
   }
   boolean onCommand2(CommandSender sender, Command cmd, String label, String[] args) {
	   Player p2 = (Player) sender;
       if(cmd.getName().equalsIgnoreCase("redbull")) {
		   p2.sendMessage(ChatColor.GREEN + "drinked redbull!");
		   p2.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(25.0D); //set run speed to 25+ so fast amk
		   Thread.sleep(5000);
		   
		   return false;
	   }   
   }
}
