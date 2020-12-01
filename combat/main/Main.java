package combat.main;

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
    p.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(32.0D);
    p.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(3.0D);
    p.sendMessage(ChatColor.RED + "Welcome to null!");
    p.setWalkSpeed(20.0F);
  }
  
  public void onEnable() {
    Bukkit.getServer().getPluginManager().registerEvents(this, (Plugin)this);
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("info")) {
      p.sendMessage(ChatColor.RED + p.getDisplayName());
      p.sendMessage(ChatColor.GREEN + "HP: " + p.getHealth());
      p.sendMessage(ChatColor.DARK_BLUE + "kills: " + p.getKiller());
    } 
    return false;
  }
}
