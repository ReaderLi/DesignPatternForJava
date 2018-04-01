package com.lrd.AbstractFactoryPattern;


public abstract class PizzaStore {

    public Pizza orderPizza(String type,String pizzaStyle){

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        if(pizzaStyle.equals("NYStyle")){
            pizza.cutDiagonal();
        }else{
            pizza.cutSquare();
        }


        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
