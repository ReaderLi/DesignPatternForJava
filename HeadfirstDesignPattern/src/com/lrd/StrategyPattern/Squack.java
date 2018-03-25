package com.lrd.StrategyPattern;

public class Squack implements QuackBehavior{

    @Override
    public void quack(){
        System.out.println("I can quack by zhizhi!");
    }
}
