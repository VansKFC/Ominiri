package tweaks;

import net.minecraft.server.v1_16_R3.PacketPlayOutViewDistance;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.attribute.Attribute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
  @EventHandler
  public void onJoin(PlayerJoinEvent event) {
    Player p = event.getPlayer();
    p.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(2.6D);
    p.getAttribute(Attribute.GENERIC_ATTACK_DAMAGE).setBaseValue(15.4D);
    p.sendMessage("" + ChatColor.RED + "Welcome to Ominiri!");
    p.sendMessage("" + ChatColor.AQUA + "No rules, just enjoy yourself :)");
    p.sendMessage("" + ChatColor.DARK_PURPLE + p.getName() + ChatColor.DARK_GREEN + " joined the server"); // TODO: Remove default join/quit messages.
  }

  public void OnQuit(PlayerQuitEvent event){
    Player p = event.getPlayer();
    p.sendMessage("" + ChatColor.DARK_PURPLE + getName() + ChatColor.DARK_RED + " left the server");
  }

  public void onEnable() {
    Bukkit.getServer().getPluginManager().registerEvents(this, (Plugin)this);
  }

  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    Player p = (Player) sender;
    if (cmd.getName().equalsIgnoreCase("info")) {
      p.sendMessage("" + ChatColor.RED + ChatColor.RED);
      p.sendMessage("" + ChatColor.GREEN + "HP: " + ChatColor.GREEN);
      p.sendMessage("" + ChatColor.DARK_BLUE + "kills: " + ChatColor.DARK_BLUE);
    }
    return false;
  }
}
