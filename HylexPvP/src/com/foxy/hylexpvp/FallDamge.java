package com.foxy.hylexpvp;

import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.EntityDamageEvent;

public class FallDamge implements Listener {
  @EventHandler
  public void onFall(EntityDamageEvent e) {
    if (e.getCause() == EntityDamageEvent.DamageCause.FALL)
      e.setCancelled(true); 
  }
}
