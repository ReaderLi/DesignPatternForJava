package com.lrd.TemplateMethodPattern;

import javax.swing.*;
import java.awt.*;

public class MyFram extends JFrame {

    public MyFram(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300,300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        String msg = "I rule!";
        graphics.drawString(msg,getWidth()/2,getHeight()/2);
    }

    public static void main(String[] args) {
        MyFram myFram = new MyFram("Head First Design Patterns");
    }

}
