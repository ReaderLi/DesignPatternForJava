package com.lrd.CommandPattern;

public class RemoteControlTest {

    public static void main(String[] args){
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen Light");
        Stereo livingRoomStereo = new Stereo("Living Room");
        Stereo kitchenStereo = new Stereo("Kitchen Room");

        //create all light command
        LightOnCommand livingRooomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn =
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff =
                new LightOffCommand(kitchenLight);

        //create all stereo command
        StereoOnCommand livingRooomStereoOn =
                new StereoOnCommand(livingRoomStereo);
        StereoOffCommand livingRoomStereoOff =
                new StereoOffCommand(livingRoomStereo);
        StereoOnCommand kitchenStereoOn =
                new StereoOnCommand(kitchenStereo);
        StereoOffCommand kitchenStereoOff =
                new StereoOffCommand(kitchenStereo);

        remoteControl.setCommand(0,livingRooomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommand(2,livingRooomStereoOn,livingRoomStereoOff);
        remoteControl.setCommand(3,kitchenStereoOn,kitchenStereoOff);

        System.out.println(remoteControl.toString());

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);

    }
}
