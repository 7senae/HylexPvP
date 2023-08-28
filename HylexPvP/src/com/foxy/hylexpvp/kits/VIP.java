package com.foxy.hylexpvp.kits;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import com.foxy.hylexpvp.Main;

public class VIP {


  public static void VIPKit(Player p) {
    PlayerInventory inv = p.getInventory();
    inv.setItem(0, Sword6(p));
    inv.setItem(1, Rod6(p));
    inv.setItem(2, Bow6(p));
    inv.setItem(7, Fire6(p));
    inv.setItem(8, arrow6(p));
    inv.setHelmet(Helmet6(p));
    inv.setChestplate(Chestplate6(p));
    inv.setLeggings(Leggings6(p));
    inv.setBoots(Boot6(p));
  }
  
  public static ItemStack Sword6(Player p) {
    ItemStack item = new ItemStack(Material.IRON_SWORD);
    item.addEnchantment(Enchantment.DAMAGE_ALL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Sword"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  
  public static ItemStack Fire6(Player p) {
    ItemStack item = new ItemStack(Material.FIREBALL);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Fire"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  
  public static ItemStack Bow6(Player p) {
    ItemStack item = new ItemStack(Material.BOW);
    item.addEnchantment(Enchantment.ARROW_DAMAGE, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Bow"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Rod6(Player p) {
    ItemStack item = new ItemStack(Material.FISHING_ROD);
    item.addEnchantment(Enchantment.DURABILITY, 3);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Rod"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Helmet6(Player p) {
    ItemStack item = new ItemStack(Material.DIAMOND_HELMET);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Chestplate6(Player p) {
    ItemStack item = new ItemStack(Material.IRON_CHESTPLATE);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Leggings6(Player p) {
    ItemStack item = new ItemStack(Material.IRON_LEGGINGS);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Boot6(Player p) {
    ItemStack item = new ItemStack(Material.IRON_BOOTS);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack arrow6(Player p) {
    ItemStack item = new ItemStack(Material.ARROW, 3);
    ItemMeta meta = item.getItemMeta();
    item.setItemMeta(meta);
    return item;
  }
}
