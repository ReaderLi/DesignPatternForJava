package com.lrd.StrategyPattern;

public class FlyNoWAY implements FlyBehavior{

    @Override
    public void fly(){
        System.out.println("I can't fly.");
    }
}
