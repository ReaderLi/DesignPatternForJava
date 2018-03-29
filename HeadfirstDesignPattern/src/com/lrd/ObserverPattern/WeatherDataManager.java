package com.lrd.ObserverPattern;

import java.util.HashMap;
import java.util.Map;

public class WeatherDataManager {

    private Map<String, WeatherData> weatherDataMap = new HashMap<>();

    public void addWeatherData(String weatherDataName,WeatherData weatherData){
        weatherDataMap.put(weatherDataName,weatherData);

    }

    public void getWeatherData(String weatherDataName){
        weatherDataMap.get(weatherDataName);
    }

    public Map getweatherDataMap(){
        return weatherDataMap;
    }

}
