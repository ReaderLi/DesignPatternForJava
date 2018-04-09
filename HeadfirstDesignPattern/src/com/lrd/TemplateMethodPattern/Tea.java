package com.lrd.TemplateMethodPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tea extends CaffeineBeverageWithHook {

    @Override
    public void brew() {
        System.out.println("Stepping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    public void printCondimentsInfo() {
        System.out.print("Would you like lemon with your tea (y/n)? ");
    }
}
