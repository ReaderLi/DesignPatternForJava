package com.lrd.AbstractFactoryPattern.Ingredient;

public class FrozenClams implements Clams {

    private String name = "frozen clams";

    @Override
    public String getName() {
        return name;
    }
}
