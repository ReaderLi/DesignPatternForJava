package com.lrd.CommandPattern;

public class CeilingFanOffCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan =ceilingFan;

    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.setOff();
    }

    @Override
    public void undo() {
        switch (prevSpeed){

            case CeilingFan.HIGH:   ceilingFan.setHigh();  break;

            case CeilingFan.MEDIUM: ceilingFan.setMedium();break;

            case CeilingFan.LOW:    ceilingFan.setLow();   break;

            case CeilingFan.OFF:    ceilingFan.setOff();   break;

            default:System.out.println("default");break;

        }

    }
}
