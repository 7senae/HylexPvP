package com.foxy.hylexpvp;

import org.bukkit.event.Listener;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import com.foxy.hylexpvp.MySQL.Deaths;
import com.foxy.hylexpvp.MySQL.Kills;
import com.foxy.hylexpvp.MySQL.Points;

public class DeathEvent implements Listener {
  @EventHandler
  public void onDeath(PlayerDeathEvent e) {
    e.setDeathMessage(null);
    Player p = e.getEntity();
    Player k = e.getEntity().getKiller();
    int health = (int)k.getHealth();
    e.setDeathMessage(null);
    p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&cYou have killed by " + k.getDisplayName() + " with " + " §c " + health + "  " + " §c❤"));
    p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&c - " + (Points.getPvPp(p) / 50)));
    k.sendMessage(Main.color(String.valueOf(Main.prefix) + "&aYou have kill " + p.getDisplayName() + " with " + " §c " + health + "  " + " §c❤"));
    k.sendMessage(Main.color(String.valueOf(Main.prefix) + "&a + " + (Points.getPvPp(p) / 50)));

      Actionbar msgk = new Actionbar(Main.color(" §61 + &cKill §6 + &a" + (Points.getPvPp(p) / 50) + " "));
      msgk.send(k);
    
    Actionbar msgp = new Actionbar(Main.color(" &61 + &cDeath &4 - &a" + (Points.getPvPp(p) / 50) ));
    msgp.send(p);
    KillStreakStats.addKillStreakNow(k.getName(), 1);
    KillStreakStats.setKillStreakNow(p.getName(), 0);
    Kills.addPvP(k.getName(), 1);
    Deaths.addPvPd(p.getName(), 1);
    Points.addPvPp(k.getName(), Points.getPvPp(p.getName()) / 50);
    Points.removePvPp(p.getName(), Points.getPvPp(p.getName()) / 50);
    ScoreBoard.SB(p);
    ScoreBoard.SB(k);
  }
}
