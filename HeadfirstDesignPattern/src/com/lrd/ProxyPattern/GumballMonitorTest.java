package com.lrd.ProxyPattern;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTest {

    public static void main(String[] args) {
        String[] locations = {
                "rmi://localhost:8888/santafe.mightygumball.com/gumballMachine",
                "rmi://localhost:8888/boudler.mightygumball.com/gumballMachine",
                "rmi://localhost:8888/seattle.mightygumball.com/gumballMachine"
        };
        GumballMonitor[] monitors = new GumballMonitor[locations.length];
        for (int i=0;i < locations.length;i++) {
            try {
                GumballMachineRemote machineRemote =
                        (GumballMachineRemote) Naming.lookup(locations[i]);
                monitors[i] = new GumballMonitor(machineRemote);
                System.out.println(monitors[i]);
            } catch (NotBoundException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (RemoteException e) {
                e.printStackTrace();
            }

        }


        for (int i=0;i<monitors.length;i++) {
            System.out.println();
            monitors[i].report();
        }

    }
}
