package com.foxy.hylexpvp;



import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import com.foxy.hylexpvp.MySQL.Deaths;
import com.foxy.hylexpvp.MySQL.Kills;
import com.foxy.hylexpvp.MySQL.Points;


public class ScoreBoard {
	

	
	
  public static void SB(Player p) {
    ScoreboardManager manger = Bukkit.getServer().getScoreboardManager();
    Scoreboard SB = manger.getNewScoreboard();
    Objective o = SB.registerNewObjective("foxy", "dummy");
    o.setDisplaySlot(DisplaySlot.SIDEBAR);
    o.setDisplayName("§8▄▆▛ §c§l PvP §8▜▆▄ ");
    o.getScore("§7§8§9").setScore(10);
    o.getScore("§8» §b§lRank").setScore(9);
    o.getScore(" " + PS_List.getPs(p)).setScore(8);
    o.getScore("§4             ").setScore(7);
    o.getScore("§8» §3§lKills").setScore(6);
    o.getScore("§8 §7 " + Kills.getPvP(p)).setScore(5);
    o.getScore("§e§8§7").setScore(4);
    o.getScore("§8» §6§lPoints").setScore(3);
    o.getScore("§5 §7 " + Points.getPvPp(p)).setScore(2);
    o.getScore("§1 ").setScore(1);
    o.getScore("§e DmarMc.net").setScore(0);
    p.setScoreboard(SB);
    p.setScoreboard(SB);
  }
}
