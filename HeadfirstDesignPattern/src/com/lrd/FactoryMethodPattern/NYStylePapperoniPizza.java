package com.lrd.FactoryMethodPattern;

public class NYStylePapperoniPizza extends Pizza{

    public NYStylePapperoniPizza(){
        name = "NY Style Sauce and Papperoni Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
