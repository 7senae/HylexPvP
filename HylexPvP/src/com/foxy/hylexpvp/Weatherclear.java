package com.foxy.hylexpvp;

import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;



public class Weatherclear implements Listener {
  public void onWeather(WeatherChangeEvent e) {
    e.setCancelled(true);
  }
}
