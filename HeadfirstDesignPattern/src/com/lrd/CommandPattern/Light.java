package com.lrd.CommandPattern;

public class Light {
    private String lightStatus;
    private String lightLocation;

    public Light(String lightLocation){
        this.lightLocation = lightLocation;
        this.lightStatus = "off";
    }

    public void on(){
        if(this.lightStatus.equals("off")){
            this.lightStatus = "on";
        }
        System.out.println(this.lightLocation + " light is on");
    }

    public void off(){
        if(this.lightStatus.equals("on")){
            this.lightStatus = "off";
        }
        System.out.println(this.lightLocation + " light is off");
    }
}
