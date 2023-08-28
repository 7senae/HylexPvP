package com.foxy.hylexpvp;



import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class KillsSteaks implements Listener {
  @EventHandler
  public void onDeath(PlayerDeathEvent e) {
    Player k = e.getEntity().getKiller();
    PlayerInventory inv = k.getInventory();
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 5) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 5 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 10) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 10 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 15) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 15 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 20) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 20 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 25) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 25 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 30) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 30 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 35) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 35 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 40) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 40 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 45) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 45 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 50) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 50 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 55) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 55 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 60) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 60 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 65) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 65 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 70) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 70 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 75) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 75 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 80) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 80 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 85) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 85 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 90) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 90 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 95) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 95 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
    if (KillStreakStats.getKillStreakNow(k.getName()).intValue() == 100) {
      Bukkit.broadcastMessage(Main.color(String.valueOf(String.valueOf(Main.prefix)) + "&c" + k.getDisplayName() + "&7 is on 100 of Killstreak !"));
      inv.addItem(new ItemStack[] { GoldenApple(k) });
    } else {
      return;
    } 
  }
  
  public static ItemStack GoldenApple(Player p) {
    ItemStack item = new ItemStack(Material.GOLDEN_APPLE, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &eGoldenApple"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
}
