package com.lrd.CommandPattern;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    private int slotNum = 7;
    public RemoteControl() {
        onCommands = new Command[slotNum];
        offCommands = new Command[slotNum];

        Command noCommmand = new NoCommand();
        for (int i=0;i < slotNum;i++){
            onCommands[i] = noCommmand;
            offCommands[i] = noCommmand;
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
    }

    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
    }


    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n             ----------- Remote Control -------------\n");
        for (int i=0;i<slotNum;i++) {
            stringBuffer.append("[slot "+i+"] "+onCommands[i].getClass().getName()
                                    +"      "+offCommands[i].getClass().getName()+"\n");
        }
        return stringBuffer.toString();
    }
}
