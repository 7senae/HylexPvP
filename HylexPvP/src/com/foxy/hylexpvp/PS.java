package com.foxy.hylexpvp;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.foxy.hylexpvp.MySQL.Points;

public class PS implements CommandExecutor {
  public boolean onCommand(CommandSender sender, Command cmd, String s, String[] s1) {
    Player p = (Player)sender;
    if (cmd.getName().equalsIgnoreCase("ps")) {
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&7✙✙✙✙✙✙✙✙✙✙✙✙✙✙✙✙✙✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &e1 &8» &750 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &e2 &8» &7100 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &e3 &8» &7250 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &e4 &8» &7400 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &e5 &8» &7700 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &e6 &8» &71200 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &e7 &8» &71500 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &e8 &8» &71900 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &e9 &8» &72100 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &e10 &8» &72400 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &e20 &8» &72800 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &e30 &8» &73200 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &640 &8» &73600 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &650 &8» &74000 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &660 &8» &74700 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &670 &8» &75300 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &c80 &8» &76000 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &c90 &8» &77000 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &c&l100 &8» &710000 &e✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&7✙✙✙✙✙✙✙✙✙✙✙✙✙✙✙✙✙✙"));
      p.sendMessage(Main.color(String.valueOf(Main.prefix) + " &7Next Level » " + NextPS.getPs(p)));
    } 
    return false;
  }
  
}