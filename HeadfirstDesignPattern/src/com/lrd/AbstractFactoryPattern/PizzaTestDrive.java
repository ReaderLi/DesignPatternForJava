package com.lrd.AbstractFactoryPattern;

public class PizzaTestDrive {

    public static void main(String[] args){

        PizzaStore nyStore = new NYPizzaStore();


        Pizza pizza = nyStore.orderPizza("cheese","NYStyle");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam","ChicagoStyle");
        System.out.println("Joel ordered a " + pizza.getName());


    }
}
