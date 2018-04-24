package com.lrd.ProxyPattern.RemoteProxyPattern;

import java.rmi.RemoteException;

public class GumballMonitor {

    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: "+gumballMachine.getLocation());
            System.out.println("Current inventory: "+gumballMachine.getCount()+" gumballs");

            State state = gumballMachine.getState();
            String currentState = "";
            if (state instanceof SoldOutState) {
                currentState = "sold out";
            }else if (state instanceof NoQuarterState) {
                currentState = "waiting for quarter";
            }else if (state instanceof HasQuarterState) {
                currentState = "waiting for turn crank";
            }else if (state instanceof SoldState) {
                currentState = "waiting for quarter";
            }
            System.out.println("Current state: "+currentState);
            System.out.println();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
