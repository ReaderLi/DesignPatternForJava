package com.lrd.FactoryMethodPattern;

public class ChicagoStylePapperoniPizza extends Pizza{

    public ChicagoStylePapperoniPizza(){

        name = "Chicago Style Deep Dish Papperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }

}
