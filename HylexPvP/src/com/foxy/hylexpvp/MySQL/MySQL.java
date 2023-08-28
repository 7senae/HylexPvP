package com.foxy.hylexpvp.MySQL;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.Bukkit;

import com.foxy.hylexpvp.Main;

public class MySQL {
  public static String host = "eu02-sql.pebblehost.com";
  
  public static String port = "3306";
  
  public static String database = "customer_199569_pvp";
  
  public static String username = "customer_199569_pvp";
  
  public static String password = "n4d7JT6WosI6UOM!N!#d";
  
  public static Connection con;
  
  public static boolean isConnected() {
    return (con != null);
  }
  
  public static void connect() {
    if (!isConnected())
      try {
        con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database + "?autoReconnect=true", username, password);
        Bukkit.getConsoleSender().sendMessage(String.valueOf(String.valueOf(Main.prefix)) + "could be successfully connected to the database");
      } catch (SQLException e) {
        Bukkit.getConsoleSender().sendMessage(String.valueOf(String.valueOf(Main.prefix)) + "could not be connected to the database");
      }  
  }
  
  public static void disconnect() {
    try {
      con.close();
      Bukkit.getConsoleSender().sendMessage(String.valueOf(String.valueOf(Main.prefix)) + "connection to the database could be closed successfully");
    } catch (SQLException e) {
      Bukkit.getConsoleSender().sendMessage(String.valueOf(String.valueOf(Main.prefix)) + "connection to the database could not be closed");
    } 
  }
  
  public static PreparedStatement getStatement(String sql) {
    if (isConnected())
      try {
        PreparedStatement ps = con.prepareStatement(sql);
        return ps;
      } catch (SQLException e) {
        e.printStackTrace();
      }  
    return null;
  }
  
  public static ResultSet getResult(String sql) {
    if (isConnected())
      try {
        PreparedStatement ps = getStatement(sql);
        ResultSet rs = ps.executeQuery();
        return rs;
      } catch (SQLException e) {
        e.printStackTrace();
      }  
    return null;
  }
}
