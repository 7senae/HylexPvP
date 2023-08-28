package com.foxy.hylexpvp;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.foxy.hylexpvp.MySQL.Deaths;
import com.foxy.hylexpvp.MySQL.Kills;
import com.foxy.hylexpvp.MySQL.Points;

public class stats implements CommandExecutor {
  public boolean onCommand(CommandSender s, Command arg1, String arg2, String[] args) {
    if (args.length == 1) {
      Player t = Bukkit.getPlayer(args[0]);
      if (!t.isOnline()) {//for player /////////////////////
        s.sendMessage("");
        s.sendMessage(String.valueOf(Main.prefix) + "§7§l§m==========§7§l(§a " + t.getName() + " §6Stats §7§l)§7§l§m==========");
        s.sendMessage(String.valueOf(Main.prefix) + "§8» §3§lKills §8» §7" + Kills.getPvP(t.getName()));
        s.sendMessage(String.valueOf(Main.prefix) + "§8» §6§lDeaths §8» §7" + Deaths.getPvPd(t.getName()));
        s.sendMessage(String.valueOf(Main.prefix) + "§8» §b§lPoints §8» §7" + Points.getPvPp(t.getName()));
        s.sendMessage(String.valueOf(Main.prefix) + "§7§l§m===§7§l(§a " + t.getName() + " §6Stats §7§l)§7§l§m===");

        s.sendMessage("");
        return true;
      } 
      s.sendMessage("");
      s.sendMessage(String.valueOf(Main.prefix) + "§7§l§m===§7§l(§a " + t.getName() + " §6Stats §7§l)§7§l§m===");
      s.sendMessage(String.valueOf(Main.prefix) + "§8» §3§lKills §8» §7" + Kills.getPvP(t.getName()));
      s.sendMessage(String.valueOf(Main.prefix) + "§8» §6§lDeaths §8» §7" + Deaths.getPvPd(t.getName()));
      s.sendMessage(String.valueOf(Main.prefix) + "§8» §b§lPoints §8» §7" + Points.getPvPp(t.getName()));
      s.sendMessage(String.valueOf(Main.prefix) + "§7§l§m===§7§l(§a " + t.getName() + " §6Stats §7§l)§7§l§m===");
      s.sendMessage("");
    } else if (args.length == 0) {//for you /////////////////////////////
      Player p = (Player)s;
      p.sendMessage("");
      p.sendMessage("");
      p.sendMessage(String.valueOf(Main.prefix) + "§7§l§m==========§7§l(§a " + p.getName() + " §6Stats §7§l)§7§l§m==========");
      s.sendMessage(String.valueOf(Main.prefix) + "§8» §3§lKills §8» §7" + Kills.getPvP(p.getName()));
      s.sendMessage(String.valueOf(Main.prefix) + "§8» §6§lDeaths §8» §7" + Deaths.getPvPd(p.getName()));
      s.sendMessage(String.valueOf(Main.prefix) + "§8» §b§lPoints §8» §7" + Points.getPvPp(p.getName()));
      s.sendMessage(String.valueOf(Main.prefix) + "§7§l§m===§7§l(§a " + p.getName() + " §6Stats §7§l)§7§l§m===");
      p.sendMessage("");
    } 
    return false;
  }
  
  
  
  

  
  
  
  
}
