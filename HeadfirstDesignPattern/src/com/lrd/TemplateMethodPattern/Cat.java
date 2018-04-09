package com.lrd.TemplateMethodPattern;

import com.lrd.StrategyPattern.Duck;

public class Cat implements Comparable {

    private String catName;
    private int catWeight;

    public Cat(String name,int weight) {
        this.catName = name;
        this.catWeight = weight;
    }

    public String toString() {
        return catName + " weight " + catWeight;
    }

    @Override
    public int compareTo(Object o) {

        Cat cat = (Cat) o;
        if (this.catWeight < cat.catWeight){
            return -1;
        }else if (this.catWeight == cat.catWeight) {
            return 0;
        }else {
            return 1;
        }
    }
}
