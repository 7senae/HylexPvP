package com.foxy.hylexpvp;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;

import com.foxy.hylexpvp.kits.Diamond;
import com.foxy.hylexpvp.kits.Emerald;
import com.foxy.hylexpvp.kits.Gold;
import com.foxy.hylexpvp.kits.Member;
import com.foxy.hylexpvp.kits.VIP;
import com.foxy.hylexpvp.kits.YT;

public class RespawnEvent implements Listener {
  @EventHandler
  public void onRespawn(PlayerRespawnEvent e) {
    Player p = e.getPlayer();
    p.setHealth(20.0D);
    p.setMaxHealth(20.0D);
    p.setFoodLevel(20);
    p.getInventory().clear();
    //kits
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