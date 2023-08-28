package com.foxy.hylexpvp.kits;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import com.foxy.hylexpvp.Main;

public class Gold {

  public static void GoldKit(Player p) {
    PlayerInventory inv = p.getInventory();
    inv.setItem(0, Sword1(p));
    inv.setItem(1, Rod1(p));
    inv.setItem(2, Bow1(p));
    inv.setItem(7, Fire1(p));
    inv.setItem(8, arrow1(p));
    inv.setHelmet(Helmet1(p));
    inv.setChestplate(Chestplate1(p));
    inv.setLeggings(Leggings1(p));
    inv.setBoots(Boot1(p));
  }
  
  public static ItemStack Sword1(Player p) {
    ItemStack item = new ItemStack(Material.STONE_SWORD);
    item.addEnchantment(Enchantment.DAMAGE_ALL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Sword"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  
  public static ItemStack Fire1(Player p) {
    ItemStack item = new ItemStack(Material.FIREBALL);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Fire"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  
  public static ItemStack Bow1(Player p) {
    ItemStack item = new ItemStack(Material.BOW);
    item.addEnchantment(Enchantment.ARROW_DAMAGE, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Bow"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Rod1(Player p) {
    ItemStack item = new ItemStack(Material.FISHING_ROD);
    item.addEnchantment(Enchantment.DURABILITY, 3);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Rod"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Helmet1(Player p) {
    ItemStack item = new ItemStack(Material.IRON_HELMET);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Chestplate1(Player p) {
    ItemStack item = new ItemStack(Material.IRON_CHESTPLATE);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Leggings1(Player p) {
    ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Boot1(Player p) {
    ItemStack item = new ItemStack(Material.IRON_BOOTS);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack arrow1(Player p) {
    ItemStack item = new ItemStack(Material.ARROW, 3);
    ItemMeta meta = item.getItemMeta();
    item.setItemMeta(meta);
    return item;
  }
}
