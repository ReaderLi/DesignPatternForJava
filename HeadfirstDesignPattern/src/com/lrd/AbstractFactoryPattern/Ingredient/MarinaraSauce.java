package com.lrd.AbstractFactoryPattern.Ingredient;

public class MarinaraSauce implements Sauce {

    private String name = "marinara sauce";

    @Override
    public String getName() {
        return name;
    }
}
