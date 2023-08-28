package com.foxy.hylexpvp.MySQL;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.bukkit.entity.Player;

public class Points {
  public static void createTable() {
    try {
      PreparedStatement ps = MySQL.getStatement("CREATE TABLE IF NOT EXISTS PvPp (Spielername VARCHAR(100), UUID VARCHAR(100), PvPp INT(100))");
      ps.executeUpdate();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static void register(Player p) {
    try {
      PreparedStatement ps = MySQL.getStatement("INSERT INTO PvPp (Spielername, UUID, PvPp) VALUES (?, ?, ?)");
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
      PreparedStatement ps = MySQL.getStatement("SELECT * FROM PvPp WHERE UUID= ?");
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
      PreparedStatement ps = MySQL.getStatement("SELECT * FROM PvPp WHERE Spielername= ?");
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
  
  public static int getPvPp(Player p) {
    try {
      PreparedStatement ps = MySQL.getStatement("SELECT * FROM PvPp WHERE UUID= ?");
      ps.setString(1, p.getUniqueId().toString());
      ResultSet rs = ps.executeQuery();
      rs.next();
      int PvPp = rs.getInt("PvPp");
      rs.close();
      ps.close();
      return PvPp;
    } catch (Exception ex) {
      ex.printStackTrace();
      return -1;
    } 
  }
  
  public static void setPvPp(Player p, int PvPp) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvPp SET PvPp= ? WHERE UUID= ?");
      ps.setInt(1, PvPp);
      ps.setString(2, p.getUniqueId().toString());
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static void addPvPp(Player p, int PvPp) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvPp SET PvPp= ? WHERE UUID= ?");
      ps.setInt(1, getPvPp(p) + PvPp);
      ps.setString(2, p.getUniqueId().toString());
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static void removePvPp(Player p, int PvPp) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvPp SET PvPp= ? WHERE UUID= ?");
      ps.setInt(1, getPvPp(p) - PvPp);
      ps.setString(2, p.getUniqueId().toString());
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static int getPvPp(String name) {
    try {
      PreparedStatement ps = MySQL.getStatement("SELECT * FROM PvPp WHERE Spielername= ?");
      ps.setString(1, name);
      ResultSet rs = ps.executeQuery();
      rs.next();
      int PvPp = rs.getInt("PvPp");
      rs.close();
      ps.close();
      return PvPp;
    } catch (Exception ex) {
      ex.printStackTrace();
      return -1;
    } 
  }
  
  public static void setPvPp(String name, int PvPp) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvPp SET PvPp= ? WHERE Spielername= ?");
      ps.setInt(1, PvPp);
      ps.setString(2, name);
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static void addPvPp(String name, int PvPp) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvPp SET PvPp= ? WHERE Spielername= ?");
      ps.setInt(1, getPvPp(name) + PvPp);
      ps.setString(2, name);
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static void removePvPp(String name, int PvPp) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvPp SET PvPp= ? WHERE Spielername= ?");
      ps.setInt(1, getPvPp(name) - PvPp);
      ps.setString(2, name);
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
}
