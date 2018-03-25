package com.lrd.StrategyPattern;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public static void main(String[] args){


        ModelDuck modelDuck = new ModelDuck();

        //Mallar duck
        modelDuck.setDuckName("Mallar Duck");
        modelDuck.displayDucktype(modelDuck.getDuckName());
        modelDuck.performFlyBehavior();
        modelDuck.performQuackBehavior();
        modelDuck.swim();
        System.out.println("********************");

        //Rubber Duck
        modelDuck.setDuckName("Rubber Duck");
        modelDuck.displayDucktype(modelDuck.getDuckName());
        modelDuck.setFlyBehavior(new FlyNoWAY());
        modelDuck.setQuackBehavior(new Squack());
        modelDuck.performFlyBehavior();
        modelDuck.performQuackBehavior();
        modelDuck.swim();
        System.out.println("********************");

        //Decoy Duck
        modelDuck.setDuckName("Decoy Duck");
        modelDuck.displayDucktype(modelDuck.getDuckName());
        modelDuck.setFlyBehavior(new FlyNoWAY());
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.performFlyBehavior();
        modelDuck.performQuackBehavior();
        modelDuck.swim();


    }

    @Override
    public void displayDucktype(String duckName){
        //绿头鸭，野鸭
        System.out.println("I'm a "+duckName);
    }

}
