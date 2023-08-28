package com.foxy.hylexpvp.MySQL;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import org.bukkit.entity.Player;

public class Deaths {
  public static void createTable() {
    try {
      PreparedStatement ps = MySQL.getStatement("CREATE TABLE IF NOT EXISTS PvPd (Spielername VARCHAR(100), UUID VARCHAR(100), PvPd INT(100))");
      ps.executeUpdate();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static void register(Player p) {
    try {
      PreparedStatement ps = MySQL.getStatement("INSERT INTO PvPd (Spielername, UUID, PvPd) VALUES (?, ?, ?)");
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
      PreparedStatement ps = MySQL.getStatement("SELECT * FROM PvPd WHERE UUID= ?");
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
      PreparedStatement ps = MySQL.getStatement("SELECT * FROM PvPd WHERE Spielername= ?");
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
  
  public static int getPvPd(Player p) {
    try {
      PreparedStatement ps = MySQL.getStatement("SELECT * FROM PvPd WHERE UUID= ?");
      ps.setString(1, p.getUniqueId().toString());
      ResultSet rs = ps.executeQuery();
      rs.next();
      int PvPd = rs.getInt("PvPd");
      rs.close();
      ps.close();
      return PvPd;
    } catch (Exception ex) {
      ex.printStackTrace();
      return -1;
    } 
  }
  
  public static void setPvPd(Player p, int PvPd) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvPd SET PvPd= ? WHERE UUID= ?");
      ps.setInt(1, PvPd);
      ps.setString(2, p.getUniqueId().toString());
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static void addPvPd(Player p, int PvPd) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvPd SET PvPd= ? WHERE UUID= ?");
      ps.setInt(1, getPvPd(p) + PvPd);
      ps.setString(2, p.getUniqueId().toString());
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static void removePvPd(Player p, int PvPd) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvPd SET PvPd= ? WHERE UUID= ?");
      ps.setInt(1, getPvPd(p) - PvPd);
      ps.setString(2, p.getUniqueId().toString());
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static int getPvPd(String name) {
    try {
      PreparedStatement ps = MySQL.getStatement("SELECT * FROM PvPd WHERE Spielername= ?");
      ps.setString(1, name);
      ResultSet rs = ps.executeQuery();
      rs.next();
      int PvPd = rs.getInt("PvPd");
      rs.close();
      ps.close();
      return PvPd;
    } catch (Exception ex) {
      ex.printStackTrace();
      return -1;
    } 
  }
  
  public static void setPvPd(String name, int PvPd) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvPd SET PvPd= ? WHERE Spielername= ?");
      ps.setInt(1, PvPd);
      ps.setString(2, name);
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static void addPvPd(String name, int PvPd) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvPd SET PvPd= ? WHERE Spielername= ?");
      ps.setInt(1, getPvPd(name) + PvPd);
      ps.setString(2, name);
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
  
  public static void removePvPd(String name, int PvPd) {
    try {
      PreparedStatement ps = MySQL.getStatement("UPDATE PvPd SET PvPd= ? WHERE Spielername= ?");
      ps.setInt(1, getPvPd(name) - PvPd);
      ps.setString(2, name);
      ps.executeUpdate();
      ps.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    } 
  }
}
