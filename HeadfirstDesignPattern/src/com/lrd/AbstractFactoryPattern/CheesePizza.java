package com.lrd.AbstractFactoryPattern;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {

        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();

        System.out.println("Prepare  " + name);
        System.out.println("dough is: " + dough.getName() + ",sauce is: " + sauce.getName() + ",cheese is: "+cheese.getName());

    }
}
