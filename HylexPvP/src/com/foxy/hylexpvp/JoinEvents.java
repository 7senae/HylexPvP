package com.foxy.hylexpvp;

import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;

import com.foxy.hylexpvp.MySQL.Deaths;
import com.foxy.hylexpvp.MySQL.Kills;
import com.foxy.hylexpvp.MySQL.Points;
import com.foxy.hylexpvp.kits.Diamond;
import com.foxy.hylexpvp.kits.Emerald;
import com.foxy.hylexpvp.kits.Gold;
import com.foxy.hylexpvp.kits.Member;
import com.foxy.hylexpvp.kits.VIP;
import com.foxy.hylexpvp.kits.YT;

public class JoinEvents implements Listener {
  @EventHandler
  public void onJoin(PlayerJoinEvent e) {
    Player p = e.getPlayer();
    ScoreBoard.SB(p);
    KillStreakStats.setKillStreakNow(p.getName(), 0);
    if (FirstJoin_Points.getfirstjoin(p.getName()).intValue() == 0) {
      Points.addPvPp(p.getName(), 500);
      FirstJoin_Points.addfirstjoin(p.getName(), 1);
    } else {
      return;
    } 
    if (!Kills.isRegistered(p))
      Kills.register(p); 
    if (!Deaths.isRegistered(p))
      Deaths.register(p); 
    if (!Points.isRegistered(p))
      Points.register(p); 
    boolean FirstJoin = p.hasPlayedBefore();
    if (!FirstJoin) {
    } else {
      return;
    } 
    if (p.hasPermission("system.Premium")) {
        Emerald.EmeraldKit(p);
      } else if (p.hasPermission("system.Emerald")) {
        VIP.VIPKit(p);
      } else if (p.hasPermission("system.YT")) {
        Gold.GoldKit(p);
      } else if (p.hasPermission("system.VIP")) {
      	Diamond.DiamondKit(p);
      } else {
        Member.MemberKit(p);
      }
  }
}