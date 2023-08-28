package com.foxy.tnt;


import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
  public void onEnable() {
    getServer().getPluginManager().registerEvents(this, (Plugin)this);
    getServer().getConsoleSender().sendMessage("§7[§5I§7-§4TNT§7]§a Plugin is loaded successfully.");
  }
  
  public void onDisable() {
    getServer().getConsoleSender().sendMessage("§7[§5I§7-§4TNT§7]§c Plugin is successfully disabled.");
  }
  
  @EventHandler
  public void BlockPlace(BlockPlaceEvent event) {
    Block block = event.getBlock();
    Player p = event.getPlayer();
    if (block.getType() == Material.TNT && (p.isOp() | p.hasPermission("itnt.allow")) ) {
      event.setCancelled(true);
      event.getPlayer().getInventory().removeItem(new ItemStack[] { new ItemStack(Material.TNT, 1) });
      event.getPlayer().updateInventory();
      Location loc = block.getLocation().add(0.5D, 0.0D, 0.5D);
      block.getWorld().spawnEntity(loc, EntityType.PRIMED_TNT);
    } 
  }
}
