package com.lrd.CommandPattern;

public class NoCommand implements Command {

    private String commandName;

    public NoCommand() {
        this.commandName = "NoCommand";
    }
    public String getCommandName() {
        return commandName;
    }

    @Override
    public void execute() {
        System.out.println("no command");
    }
}
