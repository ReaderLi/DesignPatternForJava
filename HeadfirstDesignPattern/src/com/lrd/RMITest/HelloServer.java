package com.lrd.RMITest;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class HelloServer {
    public static void main(String[] args){
        try{

            Hello hello = new HelloImpl();

            LocateRegistry.createRegistry(8888);
            Naming.bind("rmi://localhost:8888/Hello",hello);
            System.out.println(">>>>>>>INFO:远程对象绑定成功");
        }catch (RemoteException e) {
            System.out.println("创建远程对象发生异常");
            e.printStackTrace();
        }catch (AlreadyBoundException e) {
            System.out.println("重复绑定对象异常");
            e.printStackTrace();
        }catch (MalformedURLException e) {
            System.out.println("URL畸形异常");
            e.printStackTrace();
        }
    }
}
