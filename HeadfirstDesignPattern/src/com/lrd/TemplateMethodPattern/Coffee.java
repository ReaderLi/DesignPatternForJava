package com.lrd.TemplateMethodPattern;

public class Coffee extends CaffeineBeverageWithHook {

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");

    }

    @Override
    public void printCondimentsInfo() {
        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
    }
}
