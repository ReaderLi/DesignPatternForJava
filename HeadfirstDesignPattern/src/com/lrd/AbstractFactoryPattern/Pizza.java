package com.lrd.AbstractFactoryPattern;

import com.lrd.AbstractFactoryPattern.Ingredient.*;
import com.lrd.AbstractFactoryPattern.Ingredient.Veggies.Veggies;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public abstract void prepare();

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cutDiagonal(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void cutSquare(){
        System.out.println("Cutting the pizza into square slices.");
    }

    public void box(){
        System.out.println("Place pizza in offical PizzaStore box");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


}
