package com.lrd.CommandPattern;

public class GarageDoor {

    private String doorStatus = "off";

    public void open(){
        if(this.doorStatus.equals("off")){
            this.doorStatus = "on";
            System.out.println("garage door open");
        }
    }

    public void close(){
        if (this.doorStatus.equals("on")){
            this.doorStatus = "off";
            System.out.println("garage door closed");
        }
    }
}
