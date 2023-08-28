package com.foxy.hylexpvp;



import java.util.HashMap;
import java.util.Map;

import net.minecraft.server.v1_8_R3.Material;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.CommandExecutor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Difficulty;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;
import org.bukkit.entity.Item;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import com.foxy.hylexpvp.MySQL.Deaths;
import com.foxy.hylexpvp.MySQL.Kills;
import com.foxy.hylexpvp.MySQL.MySQL;
import com.foxy.hylexpvp.MySQL.Points;

public class Main extends JavaPlugin {
  public static Inventory inv;
  
  public static Main plugin;
  
  public static String prefix = "§8┃ §c§lPvP §8» §7 ";
  
  private boolean titlechanged = false;
  
  int getCobwebOnGround;

  public HashMap<String, Long> cooldowns = new HashMap<String, Long>();

  int cooldownTime = 10;


  
  public void onEnable() {
    plugin = this;
    MySQL.connect();
    Kills.createTable();
    Points.createTable();
    Deaths.createTable();
    Bukkit.getConsoleSender().sendMessage(color("&b&m------------------------------------------"));
    Bukkit.getConsoleSender().sendMessage(color("&b"));
    Bukkit.getConsoleSender().sendMessage(color("&8┃  §c§lPvP §8┃ §7Plugin has been §a[Enable]"));
    Bukkit.getConsoleSender().sendMessage(color("&b"));
    Bukkit.getConsoleSender().sendMessage(color("&b&m------------------------------------------"));
    register();
  }
  
  public void onDisable() {
    Bukkit.getConsoleSender().sendMessage(color("&b&m------------------------------------------"));
    Bukkit.getConsoleSender().sendMessage(color("&b"));
    Bukkit.getConsoleSender().sendMessage(color("&8┃  §c§lPvP §8┃ §7Plugin has been §c[Disable]"));
    Bukkit.getConsoleSender().sendMessage(color("&b"));
    Bukkit.getConsoleSender().sendMessage(color("&b&m------------------------------------------"));
  }
  
  public static String color(String s) {
    return ChatColor.translateAlternateColorCodes('&', s);
  }
  
  
  
  
  

  
  public void register() {
    PluginManager pm = Bukkit.getPluginManager();
    pm.registerEvents((Listener)new JoinEvents(), (Plugin)this);
    pm.registerEvents((Listener)new DeathEvent(), (Plugin)this);
    pm.registerEvents((Listener)new RespawnEvent(), (Plugin)this);
    pm.registerEvents((Listener)new interact(), (Plugin)this);
    pm.registerEvents((Listener)new Weatherclear(), (Plugin)this);
    pm.registerEvents((Listener)new KillsSteaks(), (Plugin)this);
    pm.registerEvents((Listener)new FastRod(), (Plugin)this);
    pm.registerEvents((Listener)new FallDamge(), (Plugin)this);
    pm.registerEvents(new PVP(), (Plugin)this);
    pm.registerEvents(new JumpPads(), (Plugin)this);
    getCommand("add").setExecutor((CommandExecutor)new Add());
    getCommand("stats").setExecutor((CommandExecutor)new stats());
    getCommand("ps").setExecutor((CommandExecutor)new PS());
  }
  
  
  
  
  
  
  
  
  
  

  public static Inventory tools() {
    inv = Bukkit.createInventory(null, 27, "» Tools");
    inv.setItem(11, ShopMenu.tnt());
    inv.setItem(13, ShopMenu.cobweb());   
    inv.setItem(15, ShopMenu.goldenapple());
    inv.setItem(0, ShopMenu.glass());
    inv.setItem(1, ShopMenu.glass());
    inv.setItem(2, ShopMenu.glass());
    inv.setItem(3, ShopMenu.glass());
    inv.setItem(4, ShopMenu.glass());
    inv.setItem(5, ShopMenu.glass());
    inv.setItem(6, ShopMenu.glass());
    inv.setItem(7, ShopMenu.glass());
    inv.setItem(8, ShopMenu.glass());
    inv.setItem(9, ShopMenu.glass());
    inv.setItem(10, ShopMenu.glass());
    inv.setItem(12, ShopMenu.glass());
    inv.setItem(14, ShopMenu.glass());
    inv.setItem(16, ShopMenu.glass());
    inv.setItem(17, ShopMenu.glass());
    inv.setItem(18, ShopMenu.glass());
    inv.setItem(19, ShopMenu.glass());
    inv.setItem(20, ShopMenu.glass());
    inv.setItem(21, ShopMenu.glass());
    inv.setItem(23, ShopMenu.glass());
    inv.setItem(24, ShopMenu.glass());
    inv.setItem(25, ShopMenu.glass());
    inv.setItem(22, ShopMenu.glass());
    return inv;
  }
  
  public static Inventory KitSelector() {
	    inv = Bukkit.createInventory(null, 27, "» KitSelector");
	    inv.setItem(16, ShopMenu.kitvip());
	    inv.setItem(12, ShopMenu.kitdiamond());   
	    inv.setItem(11, ShopMenu.kitgold());
	    
	    inv.setItem(0, ShopMenu.glass());
	    inv.setItem(1, ShopMenu.glass());
	    inv.setItem(2, ShopMenu.glass());
	    inv.setItem(3, ShopMenu.glass());
	    inv.setItem(4, ShopMenu.glass());
	    inv.setItem(5, ShopMenu.glass());
	    inv.setItem(6, ShopMenu.glass());
	    inv.setItem(7, ShopMenu.glass());
	    inv.setItem(8, ShopMenu.glass());
	    inv.setItem(9, ShopMenu.glass());
	    inv.setItem(10, ShopMenu.kitmember());
	    inv.setItem(13, ShopMenu.glass());
	    inv.setItem(14, ShopMenu.kityt());
	    inv.setItem(15, ShopMenu.kitemerald());
	    inv.setItem(17, ShopMenu.glass());
	    inv.setItem(18, ShopMenu.glass());
	    inv.setItem(19, ShopMenu.glass());
	    inv.setItem(20, ShopMenu.glass());
	    inv.setItem(21, ShopMenu.glass());
	    inv.setItem(23, ShopMenu.glass());
	    inv.setItem(24, ShopMenu.glass());
	    inv.setItem(25, ShopMenu.glass());
	    inv.setItem(26, ShopMenu.glass());
	    inv.setItem(22, ShopMenu.glass());
	    return inv;
	  }
	  
 }

  
  

  



  
  
  
  
  

  