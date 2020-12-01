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
    Player player = event.getPlayer();
    player.getAttribute(Attribute.GENERIC_ATTACK_SPEED).setBaseValue(32.0D);
  }

  public void onEnable() { //Done by fatih437tr
    Bukkit.getServer().getPluginManager().registerEvents(this, (Plugin)this);
  }

  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    Player g = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("info")) {
      g.sendMessage(ChatColor.RED + g.getDisplayName());
      g.sendMessage(ChatColor.GREEN + "HP: " + g.getHealth());
      g.sendMessage(ChatColor.DARK_BLUE + "kills: " + g.getKiller());
    }
    return false;
  }
}
