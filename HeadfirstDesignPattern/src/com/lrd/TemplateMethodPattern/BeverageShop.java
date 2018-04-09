package com.lrd.TemplateMethodPattern;
/**
 *
 * 模板方法定义了一个算法的步骤，允许子类为一个或多个步骤提供实现
 *
 * */
public class BeverageShop {

    public static void main(String[] args){

        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("--- order a cup of tea. ---");
        tea.prepareRecipe();

        System.out.println("\n--- order a cup of coffee. ---");
        coffee.prepareRecipe();
    }
}
