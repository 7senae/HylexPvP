package com.foxy.hylexpvp;


import java.util.ArrayList;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class ShopMenu {
	//SystemShop/////////////////////////////////////////
  public static ItemStack glass() {
    ItemStack item = new ItemStack(Material.getMaterial(160), 1, (short)15);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("&7|"));
    item.setItemMeta(meta);
    return item;
  }
  
    public static ItemStack tools() {
    ItemStack item = new ItemStack(Material.DIAMOND_SWORD);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("&8» &7Tools"));
    ArrayList<String> lore = new ArrayList<>(1);
    lore.add(Main.color("&e  "));
    lore.add(Main.color("&7 Tools &8»&c TNT &7,&c Cobweb &7,&c Golden apple "));
    meta.setLore(lore);
    item.setItemMeta(meta);
    return item;
  }
  
    public static ItemStack Particles() {
    ItemStack item = new ItemStack(Material.ENDER_PEARL);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("&8» &7Particles"));
    ArrayList<String> lore = new ArrayList<>(1);
    lore.add(Main.color("&e  "));
    lore.add(Main.color("&7 Particles &8»&c Particles "));
    meta.setLore(lore);
    item.setItemMeta(meta);
    return item;
  }
  
    public static ItemStack kitss() {
    ItemStack item = new ItemStack(Material.IRON_CHESTPLATE);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("&8» &7KitSelector"));
    ArrayList<String> lore = new ArrayList<>(1);
    lore.add(Main.color("&e  "));
    lore.add(Main.color("&7 KitSelector &8»&c Member &7,&c VIP &7,,, "));
    meta.setLore(lore);
    item.setItemMeta(meta);
    return item;
  }
	//SystemShop/////////////////////////////////////////

    
    
    
    //KitSelector////////////////////////////////////////////////////////////

    public static ItemStack kitvip() {
    ItemStack item = new ItemStack(Material.DIAMOND_CHESTPLATE);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("&8» &aVIP"));
    ArrayList<String> lore = new ArrayList<>(1);
    lore.add(Main.color("&e  "));
    lore.add(Main.color("&7KitSelector &8»&7 Kit VIP"));
    meta.setLore(lore);
    item.setItemMeta(meta);
    return item;
  }
    public static ItemStack kityt() {
    ItemStack item = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("&8» &0OverPower"));
    ArrayList<String> lore = new ArrayList<>(1);
    lore.add(Main.color("&e  "));
    lore.add(Main.color("&7KitSelector &8»&7 Kit OverPower"));
    meta.setLore(lore);
    item.setItemMeta(meta);
    return item;
  }
    public static ItemStack kitemerald() {
    ItemStack item = new ItemStack(Material.EMERALD);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("&8» &9Premium"));
    ArrayList<String> lore = new ArrayList<>(1);
    lore.add(Main.color("&e  "));
    lore.add(Main.color("&7KitSelector &8»&7 Kit Premium"));
    meta.setLore(lore);
    item.setItemMeta(meta);
    return item;
  }
    public static ItemStack kitdiamond() {
    ItemStack item = new ItemStack(Material.DIAMOND);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("&8» &aVIP"));
    ArrayList<String> lore = new ArrayList<>(1);
    lore.add(Main.color("&e  "));
    lore.add(Main.color("&7KitSelector &8»&7 Kit VIP"));
    meta.setLore(lore);
    item.setItemMeta(meta);
    return item;
  }
    
    public static ItemStack kitgold() {
    ItemStack item = new ItemStack(Material.GOLD_INGOT);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("&8» &5YT"));
    ArrayList<String> lore = new ArrayList<>(1);
    lore.add(Main.color("&e  "));
    lore.add(Main.color("&7KitSelector &8»&7 Kit YT"));
    meta.setLore(lore);
    item.setItemMeta(meta);
    return item;
  }
    
    public static ItemStack kitmember() {
    ItemStack item = new ItemStack(Material.IRON_INGOT);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("&8» &7Member"));
    ArrayList<String> lore = new ArrayList<>(1);
    lore.add(Main.color("&e  "));
    lore.add(Main.color("&7KitSelector &8»&7 Kit Member"));
    meta.setLore(lore);
    item.setItemMeta(meta);
    return item;
  }
    //KitSelector////////////////////////////////////////////////////////////
    
    
    
    
    
    //Tools//////////////////////////////////////////////////////////////////
    
  public static ItemStack tnt() {
    ItemStack item = new ItemStack(Material.TNT);
    ItemMeta meta = item.getItemMeta();
    meta.setDisplayName(Main.color("&8» &c&lTNT"));
    ArrayList<String> lore = new ArrayList<>(1);
    lore.add(Main.color("&e  "));
    lore.add(Main.color("&8» &7&lCost &8» &710 &aPoints"));
    meta.setLore(lore);
    item.setItemMeta(meta);
    return item;
  }
  
  public static ItemStack cobweb() {
	    ItemStack item = new ItemStack(Material.WEB);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(Main.color("&8» &7&lCobWeb"));
	    ArrayList<String> lore = new ArrayList<>(1);
	    lore.add(Main.color("&e  "));
	    lore.add(Main.color("&8» &7&lCost &8» &715 &aPoints"));
	    meta.setLore(lore);
	    item.setItemMeta(meta);
	    return item;
	  }
	  
  public static ItemStack goldenapple() {
	    ItemStack item = new ItemStack(Material.GOLDEN_APPLE);
	    ItemMeta meta = item.getItemMeta();
	    meta.setDisplayName(Main.color("&8» &6&lGoldenApple"));
	    ArrayList<String> lore = new ArrayList<>(1);
	    lore.add(Main.color("&e  "));
	    lore.add(Main.color("&8» &7&lCost &8» &720 &aPoints"));
	    meta.setLore(lore);
	    item.setItemMeta(meta);
	    return item;
	  }
	  //tools///////////////////////////////////////////////////////////////
  
  
}
