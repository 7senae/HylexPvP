package com.foxy.hylexpvp;

import org.bukkit.event.Listener;


import net.citizensnpcs.api.event.NPCRightClickEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;

public class interact implements Listener {
  @EventHandler
  public void onInteract(NPCRightClickEvent e) {
    Player p = e.getClicker();
    if (e.getNPC().getName().equalsIgnoreCase(Main.color("&c&lPvP"))) {
      Inventory shop = Bukkit.createInventory(null, 54, "PvP Shop");
      shop.setItem(14, ShopMenu.tools());
      shop.setItem(12, ShopMenu.Particles());
      shop.setItem(22, ShopMenu.kitss());
      shop.setItem(19, ShopMenu.glass());
      shop.setItem(0, ShopMenu.glass());
      shop.setItem(1, ShopMenu.glass());
      shop.setItem(2, ShopMenu.glass());
      shop.setItem(3, ShopMenu.glass());
      shop.setItem(4, ShopMenu.glass());
      shop.setItem(5, ShopMenu.glass());
      shop.setItem(6, ShopMenu.glass());
      shop.setItem(7, ShopMenu.glass());
      shop.setItem(8, ShopMenu.glass());
      shop.setItem(9, ShopMenu.glass());
      shop.setItem(10, ShopMenu.glass());
      shop.setItem(11, ShopMenu.glass());
      shop.setItem(13, ShopMenu.glass());
      shop.setItem(15, ShopMenu.glass());
      shop.setItem(16, ShopMenu.glass());
      shop.setItem(17, ShopMenu.glass());
      shop.setItem(18, ShopMenu.glass());
      shop.setItem(25, ShopMenu.glass());
      shop.setItem(21, ShopMenu.glass());
      shop.setItem(23, ShopMenu.glass());
      shop.setItem(20, ShopMenu.glass());
      shop.setItem(24, ShopMenu.glass());
      shop.setItem(26, ShopMenu.glass());
      shop.setItem(27, ShopMenu.glass());
      shop.setItem(28, ShopMenu.glass());
      shop.setItem(29, ShopMenu.glass());
      shop.setItem(30, ShopMenu.glass());
      shop.setItem(31, ShopMenu.glass());
      shop.setItem(32, ShopMenu.glass());
      shop.setItem(33, ShopMenu.glass());
      shop.setItem(34, ShopMenu.glass());
      shop.setItem(35, ShopMenu.glass());
      shop.setItem(36, ShopMenu.glass());
      shop.setItem(37, ShopMenu.glass());
      shop.setItem(38, ShopMenu.glass());
      shop.setItem(39, ShopMenu.glass());
      shop.setItem(40, ShopMenu.glass());
      shop.setItem(41, ShopMenu.glass());
      shop.setItem(42, ShopMenu.glass());
      shop.setItem(43, ShopMenu.glass());
      shop.setItem(44, ShopMenu.glass());
      shop.setItem(45, ShopMenu.glass());
      shop.setItem(46, ShopMenu.glass());
      shop.setItem(47, ShopMenu.glass());
      shop.setItem(48, ShopMenu.glass());
      shop.setItem(49, ShopMenu.glass());
      shop.setItem(50, ShopMenu.glass());
      shop.setItem(51, ShopMenu.glass());
      shop.setItem(52, ShopMenu.glass());
      shop.setItem(53, ShopMenu.glass());
      p.openInventory(shop);
    } 
  }
}
