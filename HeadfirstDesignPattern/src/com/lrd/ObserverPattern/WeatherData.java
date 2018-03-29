package com.lrd.ObserverPattern;

import java.util.ArrayList;

public class WeatherData implements Subject{

    private ArrayList<Observer> observerArrayList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observerArrayList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerArrayList.add(observer);

    }

    @Override
    public void removeObserver(Observer observer) {
        int objectIndex = observerArrayList.indexOf(observer);
        if(objectIndex >= 0){
            observerArrayList.remove(objectIndex);
        }

    }

    @Override
    public void notifyObserver() {
        for (int i=0;i < observerArrayList.size(); i++){
            Observer observer = observerArrayList.get(i);
            observer.update(temperature,humidity,pressure);
        }

    }

    public void measurementsChanged(){
        notifyObserver();
    }
    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature  = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    public ArrayList<Observer> getObserverArrayList() {
        return observerArrayList;
    }

    public void setObserverArrayList(ArrayList<Observer> observerArrayList) {
        this.observerArrayList = observerArrayList;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
