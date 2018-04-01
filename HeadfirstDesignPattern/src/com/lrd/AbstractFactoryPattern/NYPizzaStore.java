package com.lrd.AbstractFactoryPattern;


public class NYPizzaStore extends PizzaStore {

    public Pizza createPizza(String item){

        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York style Cheese Pizza");
        }else if (item.equals("clam")){
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York style Clam pizza");
        }

        return pizza;

    }
}
