package com.lrd.FactoryMethodPattern;

public class NYStyleVeggiePizza extends Pizza{

    public NYStyleVeggiePizza(){
        name = "NY Style Sauce and Vegggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
