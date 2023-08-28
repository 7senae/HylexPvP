package com.foxy.hylexpvp.MySQL;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.bukkit.entity.Player;

public class Kills {
  public static void createTable() {
    try {
      PreparedStatement ps = MySQL.getStatement("CREATE TABLE IF NOT EXISTS PvP (Spielername VARCHAR(100), UUID VARCHAR(100), PvP INT(100))");
      ps.executeUpdate();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static void register(Player p) {
    try {
      PreparedStatement ps = MySQL.getStatement("INSERT INTO PvP (Spielername, UUID, PvP) VALUES (?, ?, ?)");
      ps.setString(1, p.getName());
      ps.setString(2, p.getUniqueId().toString());
      ps.setInt(3, 0);
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static boolean isRegistered(Player p) {
    try {
      PreparedStatement ps = MySQL.getStatement("SELECT * FROM PvP WHERE UUID= ?");
      ps.setString(1, p.getUniqueId().toString());
      ResultSet rs = ps.executeQuery();
      boolean user = rs.next();
      rs.close();
      rs.close();
      return user;
    } catch (Exception ex) {
      ex.printStackTrace();
      return false;
    } 
  }
  
  public static boolean isRegistered(String name) {
    try {
      PreparedStatement ps = MySQL.getStatement("SELECT * FROM PvP WHERE Spielername= ?");
      ps.setString(1, name);
      ResultSet rs = ps.executeQuery();
      boolean user = rs.next();
      rs.close();
      rs.close();
      return user;
    } catch (Exception ex) {
      ex.printStackTrace();
      return false;
    } 
  }
  
  public static int getPvP(Player p) {
    try {
      PreparedStatement ps = MySQL.getStatement("SELECT * FROM PvP WHERE UUID= ?");
      ps.setString(1, p.getUniqueId().toString());
      ResultSet rs = ps.executeQuery();
      rs.next();
      int PvP = rs.getInt("PvP");
      rs.close();
      ps.close();
      return PvP;
    } catch (Exception ex) {
      ex.printStackTrace();
      return -1;
    } 
  }
  
  public static void setPvP(Player p, int PvP) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvP SET PvP= ? WHERE UUID= ?");
      ps.setInt(1, PvP);
      ps.setString(2, p.getUniqueId().toString());
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static void addPvP(Player p, int PvP) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvP SET PvP= ? WHERE UUID= ?");
      ps.setInt(1, getPvP(p) + PvP);
      ps.setString(2, p.getUniqueId().toString());
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static void removePvP(Player p, int PvP) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvP SET PvP= ? WHERE UUID= ?");
      ps.setInt(1, getPvP(p) - PvP);
      ps.setString(2, p.getUniqueId().toString());
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static int getPvP(String name) {
    try {
      PreparedStatement ps = MySQL.getStatement("SELECT * FROM PvP WHERE Spielername= ?");
      ps.setString(1, name);
      ResultSet rs = ps.executeQuery();
      rs.next();
      int PvP = rs.getInt("PvP");
      rs.close();
      ps.close();
      return PvP;
    } catch (Exception ex) {
      ex.printStackTrace();
      return -1;
    } 
  }
  
  public static void setPvP(String name, int PvP) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvP SET PvP= ? WHERE Spielername= ?");
      ps.setInt(1, PvP);
      ps.setString(2, name);
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static void addPvP(String name, int PvP) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvP SET PvP= ? WHERE Spielername= ?");
      ps.setInt(1, getPvP(name) + PvP);
      ps.setString(2, name);
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static void removePvP(String name, int PvP) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvP SET PvP= ? WHERE Spielername= ?");
      ps.setInt(1, getPvP(name) - PvP);
      ps.setString(2, name);
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static void getTopKills(Player p, Integer i) {
    ArrayList<String> uuid = new ArrayList<>();
    ResultSet rs = MySQL.getResult("SELECT * FROM PvP ORDER BY Points DESC LIMIT " + i);
    try {
      while (rs.next())
        uuid.add(rs.getString("Playername")); 
    } catch (SQLException sQLException) {}
    Integer PlayerID = Integer.valueOf(0);
    p.sendMessage("§8§m------------§r§8§l[ §3§lTop §c? §e§lKills §8§l]§8§m-------------");
    for (int i2 = 0; i2 <= uuid.size() - 1; i2++) {
      PlayerID = Integer.valueOf(PlayerID.intValue() + 1);
      p.sendMessage("§f§l#" + PlayerID + " §6" + (String)uuid.get(i2) + " §8» §b" + getPvP(uuid.get(i2)) + " §aKills");
    } 
    p.sendMessage("§8§m---------------------§r§8§l[§c?§8§l]§8§m----------------------");
  }
}
