package com.lrd.AbstractFactoryPattern.Ingredient;

public class ThinCrustDough implements Dough {

    private String name = "thick crust dough";

    @Override
    public String getName() {
        return name;
    }
}
