package com.lrd.CommandPattern;

public class RemoteLoader {

    public static void main(String[] args){

        RemoteLoader remoteLoader = new RemoteLoader();
        //remoteLoader.executeCommandTest();
        //remoteLoader.undoCommandTest();
//        remoteLoader.CeilingFanCommandTest();
        remoteLoader.MacroCommandTest();

    }

    public void MacroCommandTest() {
        System.out.println("                            " +
                "----- remote control macro command test -----");
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        Stereo stereo = new Stereo("Living Room");
        CeilingFan ceilingFan = new CeilingFan("living Room");


        LightOnCommand lightOnCommand = new LightOnCommand(light);
        StereoOnCommand stereoOnCommand = new StereoOnCommand(stereo);
        CeilingFanHighCommand ceilingFanHighCommand =
                new CeilingFanHighCommand(ceilingFan);

        LightOffCommand lightOffCommand = new LightOffCommand(light);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
        CeilingFanOffCommand ceilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);

        Command[] partyOn = {lightOnCommand,stereoOnCommand,ceilingFanHighCommand};
        Command[] partyOff = {lightOffCommand,stereoOffCommand,ceilingFanOffCommand};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0,partyOnMacro,partyOffMacro);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();


    }

    public void CeilingFanCommandTest(){
        System.out.println("                            "+
                "----- Remote control ceiling fan command test -----");
        RemoteControl remoteControl = new RemoteControl();

        CeilingFan livingRoomFan = new CeilingFan("Living Room");

        CeilingFanHighCommand ceilingFanHighCommand =
                new CeilingFanHighCommand(livingRoomFan);
        CeilingFanMediumCommand ceilingFanMediumCommand =
                new CeilingFanMediumCommand(livingRoomFan);
        CeilingFanOffCommand ceilingFanOffCommand =
                new CeilingFanOffCommand(livingRoomFan);

        remoteControl.setCommand(0,ceilingFanMediumCommand,ceilingFanOffCommand);
        remoteControl.setCommand(1,ceilingFanHighCommand,ceilingFanOffCommand);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();

        remoteControl.onButtonWasPressed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();
    }

    public void undoCommandTest() {
        System.out.println("                            " +
                "----- Remote control undo command test -----");
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0,lightOnCommand,lightOffCommand);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        System.out.println(remoteControl.toString());

        remoteControl.undoButtonWasPressed();
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(0);
        System.out.println(remoteControl.toString());
        remoteControl.undoButtonWasPressed();

    }

    public void executeCommandTest(){

        System.out.println("                            " +
                "----- Remote control execute command test -----");
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen Light");
        Stereo livingRoomStereo = new Stereo("Living Room");
        Stereo kitchenStereo = new Stereo("Kitchen Room");

        //create all light command
        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn =
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff =
                new LightOffCommand(kitchenLight);

        //create all stereo command
        StereoOnCommand livingRoomStereoOn =
                new StereoOnCommand(livingRoomStereo);
        StereoOffCommand livingRoomStereoOff =
                new StereoOffCommand(livingRoomStereo);
        StereoOnCommand kitchenStereoOn =
                new StereoOnCommand(kitchenStereo);
        StereoOffCommand kitchenStereoOff =
                new StereoOffCommand(kitchenStereo);

        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommand(2,livingRoomStereoOn,livingRoomStereoOff);
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

        remoteControl.onButtonWasPressed(4);
        remoteControl.offButtonWasPressed(4);
    }
}
