package com.foxy.hylexpvp;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import com.foxy.hylexpvp.MySQL.Points;
import com.foxy.hylexpvp.kits.Diamond;
import com.foxy.hylexpvp.kits.Emerald;
import com.foxy.hylexpvp.kits.Gold;
import com.foxy.hylexpvp.kits.Member;
import com.foxy.hylexpvp.kits.VIP;
import com.foxy.hylexpvp.kits.YT;


public class PVP implements Listener {
  @EventHandler
  public void onClick(InventoryClickEvent e) {
    Player p = (Player)e.getWhoClicked();
    try {
      if (e.getCurrentItem().getItemMeta() == null)
        return; 
      if (p.getItemInHand().getType() == null)
        return; 
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.color("&8» &7Tools"))) {
        e.setCancelled(true);
        p.openInventory(Main.tools());
        p.playSound(p.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
      } 
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.color("&8» &c&lTNT"))) {
        e.setCancelled(true);
        if (Points.getPvPp(p) > 15) {
          p.closeInventory();
          Points.removePvPp(p, 15);
          ScoreBoard.SB(p);
          p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
          p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&6Secessfully &cTNT"));
          p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&7&l - 15 &3Points"));
          ItemStack tnt = new ItemStack(Material.TNT);
          ItemMeta tntmeta = tnt.getItemMeta();
          tntmeta.setDisplayName(Main.color("&cTNT"));
          tnt.setItemMeta(tntmeta);
          p.getInventory().addItem(new ItemStack[] { tnt });
          Actionbar msgd = new Actionbar(Main.color( Main.prefix+ " &aDone !! "));
          msgd.send(p);
        } else {
          p.closeInventory();
          p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&cYou don`t have enough Points "));
          p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
        } 
        e.setCancelled(true);
      } 
      
      
      
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.color("&8» &6&lGoldenApple"))) {
          e.setCancelled(true);
          if (Points.getPvPp(p) > 20) {
            p.closeInventory();
            Points.removePvPp(p, 20);
            ScoreBoard.SB(p);
            p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&6Secessfully &eGoldenApple"));
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&7&l - 20 &3Points"));
            ItemStack golden = new ItemStack(Material.GOLDEN_APPLE);
            ItemMeta goldenmeta = golden.getItemMeta();
            goldenmeta.setDisplayName(Main.color("&eGoldenApple"));
            golden.setItemMeta(goldenmeta);
            p.getInventory().addItem(new ItemStack[] { golden });
            Actionbar msgd = new Actionbar(Main.color( Main.prefix+ " &aDone !! "));
            msgd.send(p);
          } else {
            p.closeInventory();
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&cYou don`t have enough Points "));
            p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
          } 
          e.setCancelled(true);
        } 
      
      
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.color("&8» &7&lCobWeb"))) {
          e.setCancelled(true);
          if (Points.getPvPp(p) > 20) {
            p.closeInventory();
            Points.removePvPp(p, 20);
            ScoreBoard.SB(p);
            p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&6Secessfully &7CobWeb"));
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&7&l - 20 &3Points"));
            ItemStack web = new ItemStack(Material.WEB);
            ItemMeta webmeta = web.getItemMeta();
            webmeta.setDisplayName(Main.color("&7CobWeb"));
            web.setItemMeta(webmeta);
            p.getInventory().addItem(new ItemStack[] { web });
            Actionbar msgd = new Actionbar(Main.color( Main.prefix+ " &aDone !! "));
            msgd.send(p);
          } else {
            p.closeInventory();
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&cYou don`t have enough Points "));
            p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
          } 
          e.setCancelled(true);
        } 
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.color("&8» &7KitSelector"))) {
          e.setCancelled(true);
          p.openInventory(Main.KitSelector());
          p.playSound(p.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
        } 
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.color("&8» &0OverPower"))) {
          e.setCancelled(true);
          if (Points.getPvPp(p) > 200) {
            p.closeInventory();
            if (p.hasPermission("system.over")) {
            Points.removePvPp(p, 200);
            ScoreBoard.SB(p);
            p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&6Secessfully Kit &0OverPower"));
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&7&l - 200 &3Points"));
            YT.YTKit(p);
            Actionbar msgd = new Actionbar(Main.color( Main.prefix+ " &aDone !! "));
            msgd.send(p);
            } else {
				p.closeInventory();
	            p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
	            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&cYou don`t have Permission "));
	            Actionbar msgp = new Actionbar(Main.color( Main.prefix+ " &cYou don`t have Permission !"));
	            msgp.send(p);
			}
          } else {
            p.closeInventory();
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&cYou don`t have enough Points "));
            p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
          } 
          e.setCancelled(true);
        } 
      
      
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.color("&8» &9Premium"))) {
          e.setCancelled(true);
          if (Points.getPvPp(p) > 200) {
            p.closeInventory();
            if (p.hasPermission("system.Premium")) {
            Points.removePvPp(p, 200);
            ScoreBoard.SB(p);
            p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&6Secessfully Kit &9Premium"));
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&7&l - 200 &3Points"));
            Emerald.EmeraldKit(p);
            Actionbar msgd = new Actionbar(Main.color( Main.prefix+ " &aDone !! "));
            msgd.send(p);
            } else {
				p.closeInventory();
	            p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
	            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&cYou don`t have Permission "));
	            Actionbar msgp = new Actionbar(Main.color( Main.prefix+ " &cYou don`t have Permission !"));
	            msgp.send(p);
			}
          } else {
            p.closeInventory();
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&cYou don`t have enough Points "));
            p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
          } 
          e.setCancelled(true);
        } 
      
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.color("&8» &aEmerald"))) {
          e.setCancelled(true);
          if (Points.getPvPp(p) > 200) {
            p.closeInventory();
            if (p.hasPermission("system.Emerald")) {
            Points.removePvPp(p, 200);
            ScoreBoard.SB(p);
            p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&6Secessfully Kit &aEmerald"));
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&7&l - 200 &3Points"));
            VIP.VIPKit(p);
            Actionbar msgd = new Actionbar(Main.color( Main.prefix+ " &aDone !! "));
            msgd.send(p);
            } else {
				p.closeInventory();
	            p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
	            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&cYou don`t have Permission "));
	            Actionbar msgp = new Actionbar(Main.color( Main.prefix+ " &cYou don`t have Permission !"));
	            msgp.send(p);
			}
          } else {
            p.closeInventory();
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&cYou don`t have enough Points "));
            p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
          } 
          e.setCancelled(true);
        } 
      
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.color("&8» &aVIP"))) {
          e.setCancelled(true);
          if (Points.getPvPp(p) > 200) {
            p.closeInventory();
            if (p.hasPermission("system.VIP")) {
            Points.removePvPp(p, 200);
            ScoreBoard.SB(p);
            p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&6Secessfully Kit &aVIP"));
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&7&l - 200 &3Points"));
            Diamond.DiamondKit(p);
            Actionbar msgd = new Actionbar(Main.color( Main.prefix+ " &aDone !! "));
            msgd.send(p);
            } else {
				p.closeInventory();
	            p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
	            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&cYou don`t have Permission "));
	            Actionbar msgp = new Actionbar(Main.color( Main.prefix+ " &cYou don`t have Permission !"));
	            msgp.send(p);
			}
          } else {
            p.closeInventory();
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&cYou don`t have enough Points "));
            p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
          } 
          e.setCancelled(true);
        } 
      
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.color("&8» &5YT"))) {
          e.setCancelled(true);
          if (Points.getPvPp(p) > 200) {
            p.closeInventory();
            if (p.hasPermission("system.YT")) {
            Points.removePvPp(p, 200);
            ScoreBoard.SB(p);
            p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&6Secessfully Kit &5YT"));
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&7&l - 200 &3Points"));
            Gold.GoldKit(p);
            Actionbar msgd = new Actionbar(Main.color( Main.prefix+ " &aDone !! "));
            msgd.send(p);
            } else {
				p.closeInventory();
	            p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
	            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&cYou don`t have Permission "));
 
			}
          } else {
            p.closeInventory();
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&cYou don`t have enough Points "));
            p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
          } 
          e.setCancelled(true);
        } 
      
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.color("&8» &7Member"))) {
          e.setCancelled(true);
          if (Points.getPvPp(p) > 200) {
            p.closeInventory();
            if (p.hasPermission("Vule.Member")) {
            Points.removePvPp(p, 200);
            ScoreBoard.SB(p);
            p.playSound(p.getLocation(), Sound.VILLAGER_YES, 1.0F, 5.0F);
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&6Secessfully Kit &7Member"));
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&7&l - 200 &3Points"));
            Member.MemberKit(p);
            Actionbar msgd = new Actionbar(Main.color( Main.prefix+ " &aDone !! "));
            msgd.send(p);
            } else {
				p.closeInventory();
	            p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
	            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&cYou don`t have Permission "));

			}
          } else {
            p.closeInventory();
            p.sendMessage(Main.color(String.valueOf(Main.prefix) + "&cYou don`t have enough Points "));
            p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
          } 
          e.setCancelled(true);
        } 
      
      if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.color("&8» &7Particles"))) {
          e.setCancelled(true);
          p.chat("/particles");
          p.playSound(p.getLocation(), Sound.NOTE_STICKS, 1.0F, 5.0F);
        } 
      
            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(Main.color("&7|"))) {
                p.playSound(p.getLocation(), Sound.VILLAGER_NO, 1.0F, 5.0F);
        e.setCancelled(true);
        }


    } catch (Exception exception) {}
  }
}
