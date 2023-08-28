package com.foxy.hylexpvp.kits;



import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import com.foxy.hylexpvp.Main;

public class Emerald {


  public static void EmeraldKit(Player p) {
    PlayerInventory inv = p.getInventory();
    inv.setItem(0, Sword4(p));
    inv.setItem(1, Rod4(p));
    inv.setItem(2, Bow4(p));
    inv.setItem(7, Fire4(p));
    inv.setItem(8, arrow4(p));
    inv.setHelmet(Helmet4(p));
    inv.setChestplate(Chestplate4(p));
    inv.setLeggings(Leggings4(p));
    inv.setBoots(Boot4(p));
  }
  
  public static ItemStack Sword4(Player p) {
    ItemStack item = new ItemStack(Material.IRON_SWORD);
    item.addEnchantment(Enchantment.DAMAGE_ALL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Sword"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  
  public static ItemStack Fire4(Player p) {
    ItemStack item = new ItemStack(Material.FIREBALL);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Fire"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  
  public static ItemStack Bow4(Player p) {
    ItemStack item = new ItemStack(Material.BOW);
    item.addEnchantment(Enchantment.ARROW_DAMAGE, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Bow"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Rod4(Player p) {
    ItemStack item = new ItemStack(Material.FISHING_ROD);
    item.addEnchantment(Enchantment.DURABILITY, 3);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Rod"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Helmet4(Player p) {
    ItemStack item = new ItemStack(Material.IRON_HELMET);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Chestplate4(Player p) {
    ItemStack item = new ItemStack(Material.IRON_CHESTPLATE);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Leggings4(Player p) {
    ItemStack item = new ItemStack(Material.IRON_LEGGINGS);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Boot4(Player p) {
    ItemStack item = new ItemStack(Material.IRON_BOOTS);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack arrow4(Player p) {
    ItemStack item = new ItemStack(Material.ARROW, 3);
    ItemMeta meta = item.getItemMeta();
    item.setItemMeta(meta);
    return item;
  }
}
