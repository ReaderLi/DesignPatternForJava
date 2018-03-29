package com.lrd.ObserverPattern;

import java.util.ArrayList;
import java.util.Map;

public class StatisticDisplay implements Observer,Display{

    private WeatherDataManager weatherDataManager;
    private WeatherData weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    private Map<String, WeatherData> weatherDataMap;
    private ArrayList<Float> weatherDataTemperatureArrayList = new ArrayList<>();

    public StatisticDisplay(WeatherData weatherData,WeatherDataManager weatherDataManager){
        this.weatherDataManager = weatherDataManager;
        this.weatherData = new WeatherData();
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {

        weatherDataMap = weatherDataManager.getweatherDataMap();

        for (Map.Entry<String, WeatherData> entry : weatherDataMap.entrySet()) {
            //System.out.println(entry.getKey() + ":" + entry.getValue());
            weatherDataTemperatureArrayList.add(entry.getValue().getTemperature());
        }

        float minTempe = weatherDataTemperatureArrayList.get(0);
        float maxTempe = weatherDataTemperatureArrayList.get(0);
        float avgTempe;
        float sum =  weatherDataTemperatureArrayList.get(0);

        for (int i=1;i< weatherDataTemperatureArrayList.size();i++){
            sum += weatherDataTemperatureArrayList.get(i);
            float temp = weatherDataTemperatureArrayList.get(i);

            if(minTempe > temp){
                minTempe = temp;
            }

            if (maxTempe < temp){
                maxTempe = temp;
            }
        }

        avgTempe = sum/weatherDataTemperatureArrayList.size();

        System.out.println("Avg/Max/Min temperature = " + avgTempe + "/" + maxTempe + "/" + minTempe);


    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        display();

    }
}
