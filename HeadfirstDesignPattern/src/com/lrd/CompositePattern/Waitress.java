package com.lrd.CompositePattern;

import java.util.Iterator;

public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();

//            while (menuComponent instanceof Menu){
//                menuComponent = iterator.next();
//            }  //代替try catch
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
//                System.out.println(e.toString());
//                e.printStackTrace();
            }
        }

    }
}
