package com.lrd.AbstractFactoryPattern;

import com.lrd.AbstractFactoryPattern.Ingredient.*;
import com.lrd.AbstractFactoryPattern.Ingredient.Veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();
}
