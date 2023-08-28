package com.foxy.hylexpvp;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.foxy.hylexpvp.MySQL.Points;

public class Add implements CommandExecutor {
  public boolean onCommand(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
    Player p = (Player)arg0;
    if (arg1.getName().equalsIgnoreCase("add")) {
    	if (p.hasPermission("system.op")) {
      Points.addPvPp(p, 1500);
      Actionbar msgd = new Actionbar(Main.color( Main.prefix+ " &aDone !! "));
      msgd.send(p);
    	} else {
			
    	      Actionbar msgd = new Actionbar(Main.color( Main.prefix+ " &cYou Don`t have permission "));
    	      msgd.send(p);
    		
		}
    } 
    return false;
  }
}
