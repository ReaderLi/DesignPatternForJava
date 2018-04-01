package com.lrd.AbstractFactoryPattern.Ingredient;

public class SlicedPepperoni implements Pepperoni {

    private String name = "sliced pepperoni";

    @Override
    public String getName() {
        return name;
    }
}
