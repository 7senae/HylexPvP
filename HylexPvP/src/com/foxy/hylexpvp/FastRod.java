package com.foxy.hylexpvp;

import org.bukkit.event.Listener;


import org.bukkit.entity.EntityType;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.ProjectileLaunchEvent;

public class FastRod implements Listener {
  @EventHandler
  public void fishingThrow(ProjectileLaunchEvent e) {
    Projectile ege = e.getEntity();
    if (e.getEntityType().equals(EntityType.FISHING_HOOK))
      ege.setVelocity(ege.getVelocity().multiply(1.4D)); 
  }
}
