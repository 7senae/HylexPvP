package com.foxy.hylexpvp;


import org.bukkit.entity.Player;

import com.foxy.hylexpvp.MySQL.Kills;

public class PS_List {
  public static String getPs(Player p) {
	if (Kills.getPvP(p.getName()) >= 10000)
	   return "§c100"; 
    if (Kills.getPvP(p.getName()) >= 7000)
      return "§c90"; 
    if (Kills.getPvP(p.getName()) >= 6000)
      return "§c80"; 
    if (Kills.getPvP(p.getName()) >= 5300)
      return "§670"; 
    if (Kills.getPvP(p.getName()) >= 4700)
      return "§660"; 
    if (Kills.getPvP(p.getName()) >= 4000)
      return "§650"; 
    if (Kills.getPvP(p.getName()) >= 3600)
      return "§e40"; 
    if (Kills.getPvP(p.getName()) >= 3200)
      return "§e30"; 
    if (Kills.getPvP(p.getName()) >= 2800)
      return "§e20"; 
    if (Kills.getPvP(p.getName()) >= 2400)
      return "§e10"; 
    if (Kills.getPvP(p.getName()) >= 2100)
      return "§e9"; 
    if (Kills.getPvP(p.getName()) >= 1900)
      return "§e8"; 
    if (Kills.getPvP(p.getName()) >= 1500)
      return "§e7"; 
    if (Kills.getPvP(p.getName()) >= 1200)
      return "§e6"; 
    if (Kills.getPvP(p.getName()) >= 900)
      return "§e5"; 
    if (Kills.getPvP(p.getName()) >= 600)
      return "§e5"; 
    if (Kills.getPvP(p.getName()) >= 400)
      return "§e4"; 
    if (Kills.getPvP(p.getName()) >= 250)
      return "§e3"; 
    if (Kills.getPvP(p.getName()) >= 100)
      return "§e2"; 
    if (Kills.getPvP(p.getName()) >= 50)
      return "§e1"; 
    return "0";
  }
}
