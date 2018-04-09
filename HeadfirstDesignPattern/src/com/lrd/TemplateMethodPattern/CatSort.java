package com.lrd.TemplateMethodPattern;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CatSort {

    public static void main(String[] args){
        Cat[] cats = {
                new Cat("Daffy", 8),
                new Cat("Dewey", 8),
                new Cat("Howard" ,7),
                new Cat("Louie" ,2),
                new Cat("Donald", 10),
                new Cat("Huey", 2)};
        System.out.println("Before sorting: ");
        display(cats);

        System.out.println("\nAfter sorting: ");
        Arrays.sort(cats);
        display(cats);
    }

    public static void display(Cat[] cats) {
        for (int i=0;i < cats.length;i++) {
            System.out.println(cats[i]);
        }
    }
}
