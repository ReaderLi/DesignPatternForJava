package com.lrd.StatePattern;

public class NoQuarterState implements State {


    GumballMachine gumballMachine;
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        gumballMachine.setState(gumballMachine.getHasQuarterState());
        System.out.println("You insert a quarter");

    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");

    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");

    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");

    }
}