package com.lrd.AbstractFactoryPattern;

public class ClamPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare(){

        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clams = pizzaIngredientFactory.createClam();

        System.out.println("Prepare  " + name);
        System.out.println("dough is: " + dough.getName() + ",sauce is: " + sauce.getName() + ",cheese is: "+cheese.getName() + ",clam is: "+clams.getName());
    }
}
