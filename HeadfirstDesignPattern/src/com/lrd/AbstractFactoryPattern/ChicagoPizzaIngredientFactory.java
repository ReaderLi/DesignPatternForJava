package com.lrd.AbstractFactoryPattern;

import com.lrd.AbstractFactoryPattern.Ingredient.*;
import com.lrd.AbstractFactoryPattern.Ingredient.Veggies.BlackOlives;
import com.lrd.AbstractFactoryPattern.Ingredient.Veggies.Eggplant;
import com.lrd.AbstractFactoryPattern.Ingredient.Veggies.Spinach;
import com.lrd.AbstractFactoryPattern.Ingredient.Veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new BlackOlives(),new Spinach(),new Eggplant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
