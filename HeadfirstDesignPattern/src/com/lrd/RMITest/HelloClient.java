package com.lrd.RMITest;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class HelloClient {
    public static void main(String[] args) {
        try {
            Hello hello = (Hello) Naming.lookup("rmi://localhost:8888/Hello");
            System.out.println(hello.sayHello("LRD"));

        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
