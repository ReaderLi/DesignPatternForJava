package com.lrd.CommandPattern;

public class CeilingFan {

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void setHigh() {
        speed = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    public void setMedium() {
        speed = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void setLow() {
        speed = LOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void setOff() {
        speed = OFF;
        System.out.println(location + " ceiling fan is on off");
    }

    public int getSpeed() {
        return speed;
    }

}
