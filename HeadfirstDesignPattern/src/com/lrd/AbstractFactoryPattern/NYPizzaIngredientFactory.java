package com.lrd.AbstractFactoryPattern;

import com.lrd.AbstractFactoryPattern.Ingredient.*;
import com.lrd.AbstractFactoryPattern.Ingredient.Veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(),new Onion(),new Mushroom(),new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();

    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
