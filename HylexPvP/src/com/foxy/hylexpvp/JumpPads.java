package com.foxy.hylexpvp;



import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class JumpPads implements Listener {
  @EventHandler
  public void onMove(PlayerMoveEvent e) {
    Player p = e.getPlayer();
    if (p.getLocation().getBlock().getType() == Material.IRON_PLATE) {
      Vector v = p.getLocation().getDirection().multiply(3.5D).setY(2);
      p.setVelocity(v);
      p.playEffect(p.getLocation(), Effect.BLAZE_SHOOT, 2);
    } 
    if (p.getLocation().getBlock().getType() == Material.STONE_PLATE) {
      Vector v = p.getLocation().getDirection().multiply(3.5D).setY(2);
      p.setVelocity(v);
      p.playEffect(p.getLocation(), Effect.BLAZE_SHOOT, 2);
    } 
    if (p.getLocation().getBlock().getType() == Material.GOLD_PLATE) {
      Vector v = p.getLocation().getDirection().multiply(3.5D).setY(2);
      p.setVelocity(v);
      p.playEffect(p.getLocation(), Effect.BLAZE_SHOOT, 2);
    } 
    if (p.getLocation().getBlock().getType() == Material.WOOD_PLATE) {
      Vector v = p.getLocation().getDirection().multiply(3.5D).setY(2);
      p.setVelocity(v);
      p.playEffect(p.getLocation(), Effect.BLAZE_SHOOT, 2);
    } 
  }
}
