package com.lrd.CommandPattern;

public class Stereo {

    private String stereoStatus;
    private String stereoLocation;

    public Stereo(String stereoLocation){
        this.stereoLocation = stereoLocation;
        this.stereoStatus = "off";
    }

    public void on(){
        if (stereoStatus.equals("off")) {
            stereoStatus = "on";
        }
        System.out.println(stereoLocation + " stereo is on");
    }

    public  void off() {
        if (stereoStatus.equals("on")){
            stereoStatus = "off";
        }
        System.out.println(stereoLocation + " stereo is off");
    }

    public void setCD() {
        System.out.println(stereoLocation + " stereo is set for CD input");
    }

    public void setVolume(int volumeNum) {
        System.out.println(stereoLocation + " stereo volume is set to "+volumeNum);
    }
}
