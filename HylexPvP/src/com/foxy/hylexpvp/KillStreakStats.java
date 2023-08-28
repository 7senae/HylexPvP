package com.foxy.hylexpvp;



import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.YamlConfiguration;

public class KillStreakStats {
  public static Integer getKillStreakNow(String name) {
    File file = new File("plugins/PvPHylex", "KillStreakNow.yml");
    YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
    int money = yamlConfiguration.getInt(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(name))))) + ".KillStreakNow");
    return Integer.valueOf(money);
  }
  
  public static void addKillStreakNow(String name, int amount) {
    File file = new File("plugins/PvPHylex", "KillStreakNow.yml");
    YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
    int money = yamlConfiguration.getInt(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(name))))) + ".KillStreakNow");
    money += amount;
    yamlConfiguration.set(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(name))))) + ".KillStreakNow", Integer.valueOf(money));
    try {
      yamlConfiguration.save(file);
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }
  
  public static void removeKillStreakNow(String name, int amount) {
    File file = new File("plugins/PvPHylex", "KillStreakNow.yml");
    YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
    int money = yamlConfiguration.getInt(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(name))))) + ".KillStreakNow");
    money -= amount;
    yamlConfiguration.set(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(name))))) + ".KillStreakNow", Integer.valueOf(money));
    try {
      yamlConfiguration.save(file);
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }
  
  public static void setKillStreakNow(String name, int amount) {
    File file = new File("plugins/PvPHylex", "points.yml");
    YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
    yamlConfiguration.set(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(name))))) + ".KillStreakNow", Integer.valueOf(amount));
    try {
      yamlConfiguration.save(file);
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }
}