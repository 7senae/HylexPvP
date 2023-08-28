package com.foxy.hylexpvp;



import java.io.File;
import java.io.IOException;
import org.bukkit.configuration.file.YamlConfiguration;

public class FirstJoin_Points {
  public static Integer getfirstjoin(String name) {
    File file = new File("plugins/PvPHylex", "firstjoin.yml");
    YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
    int money = yamlConfiguration.getInt(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(name))))) + ".firstjoin");
    return Integer.valueOf(money);
  }
  
  public static void addfirstjoin(String name, int amount) {
    File file = new File("plugins/PvPHylex", "firstjoin.yml");
    YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
    int money = yamlConfiguration.getInt(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(name))))) + ".firstjoin");
    money += amount;
    yamlConfiguration.set(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(name))))) + ".firstjoin", Integer.valueOf(money));
    try {
      yamlConfiguration.save(file);
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }
  
  public static void removefirstjoin(String name, int amount) {
    File file = new File("plugins/PvPHylex", "firstjoin.yml");
    YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
    int money = yamlConfiguration.getInt(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(name))))) + ".firstjoin");
    money -= amount;
    yamlConfiguration.set(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(name))))) + ".firstjoin", Integer.valueOf(money));
    try {
      yamlConfiguration.save(file);
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }
  
  public static void setfirstjoin(String name, int amount) {
    File file = new File("plugins/PvPHylex", "firstjoin.yml");
    YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration(file);
    yamlConfiguration.set(String.valueOf(String.valueOf(String.valueOf(String.valueOf(String.valueOf(name))))) + ".firstjoin", Integer.valueOf(amount));
    try {
      yamlConfiguration.save(file);
    } catch (IOException e) {
      e.printStackTrace();
    } 
  }
}
