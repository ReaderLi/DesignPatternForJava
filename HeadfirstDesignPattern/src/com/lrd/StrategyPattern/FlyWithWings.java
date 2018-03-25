package com.lrd.StrategyPattern;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly(){
        System.out.println("I can Fly with wings.");
    }
}
