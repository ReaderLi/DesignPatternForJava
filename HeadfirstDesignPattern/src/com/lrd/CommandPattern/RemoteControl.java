package com.lrd.CommandPattern;

public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    private int SLOT_NUMBER = 7;
    public RemoteControl() {
        onCommands = new Command[SLOT_NUMBER];
        offCommands = new Command[SLOT_NUMBER];

        Command noCommand = new NoCommand();
        for (int i=0;i < SLOT_NUMBER;i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }


    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n                     ----------- Remote Control -------------\n");
        for (int i=0;i<SLOT_NUMBER;i++) {
            stringBuffer.append("[slot "+i+"] "+onCommands[i].getClass().getName()
                                    +"      "+offCommands[i].getClass().getName()+"\n");
        }
        if (!undoCommand.equals("")){
            stringBuffer.append("[undo] "+undoCommand.getClass().getName()+"\n");
        }

        return stringBuffer.toString();
    }
}
