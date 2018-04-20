package com.lrd.VirtualProxyPattern;

import com.sun.javafx.robot.impl.FXRobotHelper;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

public class ImageProxyTestDrive {

    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Hashtable<String,String> cds = new Hashtable<>();

    public static void main(String[] args) {
        try {
            ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ImageProxyTestDrive() throws Exception{
        cds.put("Waiting for you","http://p3.music.126.net/A8qicH14toObbLpPMiKmBw==/109951163110962030.jpg");
        cds.put("Bedtime Stories","http://p3.music.126.net/cUTk0ewrQtYGP2YpPZoUng==/3265549553028224.jpg");
        cds.put("Hero","http://p3.music.126.net/9JOVl48dMe7U8zShniMPcA==/1372190515036862.jpg");

        URL initialUrl = new URL(cds.get("Hero"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Enumeration<String> e = cds.keys();e.hasMoreElements();) {
            String name = e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageComponent.setIcon(new ImageProxy(getCDUrl(e.getActionCommand())));
                    frame.repaint();
                }
            });
        }

        //建立框架和菜单
        Icon icon = new ImageProxy(initialUrl);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }

    URL getCDUrl(String name) {
        try{
            return new URL(cds.get(name));
        }catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
