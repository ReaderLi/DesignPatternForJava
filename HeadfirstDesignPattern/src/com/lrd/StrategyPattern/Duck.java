package com.lrd.StrategyPattern;

public abstract class Duck {
    /**
    * 模式场景描述：
    *       有一款模拟鸭子游戏，游戏中会出现各种各样的鸭子，
    *       一边游泳戏水，一边呱呱叫
    * */
    String duckName;
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


//    public Duck(){
//
//    }
    /**
     * duck swim
     * */
    public void swim(){
        System.out.println("All duck float,even decoys!");
    }

    /**
     * display duck type
     * */
    public abstract void displayDucktype(String duckName);

    /**
     * set duck name
     * */
    public void setDuckName(String inialDuckName){
        duckName = inialDuckName;
    }

    public String getDuckName(){
        return this.duckName;
    }
    /**
     * according duck type perform fly behavior
     * */
    public void performFlyBehavior(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }


    /**
     * according duck type perform quack behavior
     * */
    public void performQuackBehavior(){
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
