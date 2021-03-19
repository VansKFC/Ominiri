package tweaks;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
  @EventHandler
  public void onJoin(PlayerJoinEvent event) {
    Player p = event.getPlayer();
    p.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(5.0D);
    p.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(2.4D);
    p.sendMessage("" + ChatColor.RED + "Welcome to Ominiri!");
    p.sendMessage("" + ChatColor.LIGHT_PURPLE + "No rules, just enjoy yourself :)");
  }
  
  public void onEnable() {
    Bukkit.getServer().getPluginManager().registerEvents(this, (Plugin)this);
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("info")) {
      p.sendMessage("" + ChatColor.RED + ChatColor.RED);
      p.sendMessage("" + ChatColor.GREEN + "HP: " + ChatColor.GREEN);
      p.sendMessage("" + ChatColor.DARK_BLUE + "kills: " + ChatColor.DARK_BLUE);
    } 
    return false;
  }
  
  public boolean onCommand2(CommandSender sender, Command cmd, String label, String[] args) {
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("redbull")) {
      p.sendMessage("" + ChatColor.GREEN + "Drank Redbull!");
      p.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(25.0D);
    } 
    return false;
  }
}
