package com.lrd.ObserverPattern;

/**
 *
 *   WeatherData作为Subject接口的实现类，具有主题所有的必须属性及操作
 *   Observer借口为观察者提供update()更新数据操作
 *   display借口为观察者提供display()展示数据操作
 *
 *   CurrentConditionsDisplay 类为观察者的具体实现类，主要用于显示当前的温度和湿度
 *   StatisticDisplay类为观察者的具体实现类，主要用于计算一段时间的平均温度，最低温度和最高温度
 *
 *
 *   weatherDataManager主要用于为SatisticDisplay的功能提供WeatherData类的map数据结构的支持
 *
 * */
public class WeatherStation {

    public static void main(String[] args){


        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80.0f,65.0f,30.4f);


        WeatherDataManager weatherDataManager = new WeatherDataManager();

        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData,weatherDataManager);


        weatherDataManager.addWeatherData("weatherData1",weatherData);
        weatherData.setMeasurements(80.0f,65.0f,30.4f);

        weatherDataManager.addWeatherData("weatherData2",weatherData);
        weatherData.setMeasurements(82.0f,70.0f,29.2f);



        weatherData.setMeasurements(78.0f,90.0f,29.2f);
        weatherDataManager.addWeatherData("weatherData3",weatherData);



    }
}
