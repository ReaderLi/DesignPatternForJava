package com.lrd.AbstractFactoryPattern.Ingredient;

public class ThickCrustDough implements Dough {

    private String name = "thick crust dough";

    @Override
    public String getName() {
        return name;
    }
}
