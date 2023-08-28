package com.foxy.hylexpvp.kits;



import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

import com.foxy.hylexpvp.Main;

public class Member {
  public static void MemberKit(Player p) {
    PlayerInventory inv = p.getInventory();
    inv.setItem(0, Sword2(p));
    inv.setItem(1, Rod2(p));
    inv.setItem(2, Bow2(p));
    inv.setItem(7, Fire2(p));
    inv.setItem(8, arrow2(p));
    inv.setHelmet(Helmet2(p));
    inv.setChestplate(Chestplate2(p));
    inv.setLeggings(Leggings2(p));
    inv.setBoots(Boot2(p));
  }
  
  public static ItemStack Sword2(Player p) {
    ItemStack item = new ItemStack(Material.STONE_SWORD);
    item.addEnchantment(Enchantment.DAMAGE_ALL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Sword"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  
  public static ItemStack Fire2(Player p) {
    ItemStack item = new ItemStack(Material.FIREBALL);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Fire"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  
  public static ItemStack Bow2(Player p) {
    ItemStack item = new ItemStack(Material.BOW);
    item.addEnchantment(Enchantment.ARROW_DAMAGE, 1);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Bow"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Rod2(Player p) {
    ItemStack item = new ItemStack(Material.FISHING_ROD);
    item.addEnchantment(Enchantment.DURABILITY, 3);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("§8» &7Rod"));
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Helmet2(Player p) {
    ItemStack item = new ItemStack(Material.CHAINMAIL_HELMET);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Chestplate2(Player p) {
    ItemStack item = new ItemStack(Material.IRON_CHESTPLATE);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Leggings2(Player p) {
    ItemStack item = new ItemStack(Material.CHAINMAIL_LEGGINGS);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack Boot2(Player p) {
    ItemStack item = new ItemStack(Material.IRON_BOOTS);
    item.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
    ItemMeta meta = item.getItemMeta();
    meta.spigot().setUnbreakable(true);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack arrow2(Player p) {
    ItemStack item = new ItemStack(Material.ARROW, 3);
    ItemMeta meta = item.getItemMeta();
    item.setItemMeta(meta);
    return item;
  }
}
