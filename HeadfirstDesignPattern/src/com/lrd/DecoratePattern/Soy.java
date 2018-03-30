package com.lrd.DecoratePattern;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        //cup fee = cupSize*0.5 + 0.10
        double cost = 0.0;
        int cupSizeCode = Integer.valueOf(beverage.getCupSize());
        if(cupSizeCode > 0){
            cost = beverage.cost() + (cupSizeCode-1)*0.05 + 0.10;
        }
        return cost;
    }
}
