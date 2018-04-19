package com.lrd.ProxyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class GumballMachineTest {

    public static void main(String[] args) {
        GumballMachine gumballMachine = null;
        int count = 0;
        String location;
        String input;
        String[] arguments = new String[2];

        System.out.println("GumballMachine <name> <inventory>");

        int times = 0;
        try {
            LocateRegistry.createRegistry(8888);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

        while (times < 3){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String str = bufferedReader.readLine();
                arguments = str.split(" ");
                System.out.println("buffer is:"+str+",arguments length is:"+arguments.length);
                location = arguments[0];
                count = Integer.valueOf(arguments[1]);

                gumballMachine = new GumballMachine(location,count);

                Naming.bind("rmi://localhost:8888/"+location+"/gumballMachine",gumballMachine);
                System.out.println(">>>>>>>INFO:远程对象绑定成功");

            } catch (IOException e) {
                e.printStackTrace();
            }catch (AlreadyBoundException e) {
                System.out.println("重复绑定对象异常");
                e.printStackTrace();
            }

            times++;
        }



        //GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

//        gumballMonitor.report();
    }
}
