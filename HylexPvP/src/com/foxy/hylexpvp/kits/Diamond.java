package com.foxy.hylexpvp.kits;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import com.foxy.hylexpvp.Main;

public class Diamond {


  public static void DiamondKit(Player p) {
    PlayerInventory inv = p.getInventory();
    inv.setItem(0, Sword3(p));
    inv.setItem(1, Rod3(p));
    inv.setItem(2, Bow3(p));
    inv.setItem(7, Fire3(p));
    inv.setItem(8, arrow3(p));
    inv.setHelmet(Helmet3(p));
    inv.setChestplate(Chestplate3(p));
    inv.setLeggings(Leggings3(p));
    inv.setBoots(Boot3(p));
  }
  
  public static ItemStack Sword3(Player p) {
    ItemStack item = new ItemStack(Material.IRON_SWORD);
    item.addEnchantment(Enchantment.DAMAGE_ALL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Sword"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  
  public static ItemStack Fire3(Player p) {
    ItemStack item = new ItemStack(Material.FIREBALL);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Fire"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  
  public static ItemStack Bow3(Player p) {
    ItemStack item = new ItemStack(Material.BOW);
    item.addEnchantment(Enchantment.ARROW_DAMAGE, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Bow"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Rod3(Player p) {
    ItemStack item = new ItemStack(Material.FISHING_ROD);
    item.addEnchantment(Enchantment.DURABILITY, 3);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Rod"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Helmet3(Player p) {
    ItemStack item = new ItemStack(Material.IRON_HELMET);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Chestplate3(Player p) {
    ItemStack item = new ItemStack(Material.IRON_CHESTPLATE);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Leggings3(Player p) {
    ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Boot3(Player p) {
    ItemStack item = new ItemStack(Material.IRON_BOOTS);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack arrow3(Player p) {
    ItemStack item = new ItemStack(Material.ARROW, 3);
    ItemMeta meta = item.getItemMeta();
    item.setItemMeta(meta);
    return item;
  }
}
