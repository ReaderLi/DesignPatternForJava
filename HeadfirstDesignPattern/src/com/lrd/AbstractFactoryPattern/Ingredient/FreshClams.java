package com.lrd.AbstractFactoryPattern.Ingredient;

public class FreshClams implements Clams {

    String name = "Fresh Clam";

    @Override
    public String getName() {
        return name;
    }
}
