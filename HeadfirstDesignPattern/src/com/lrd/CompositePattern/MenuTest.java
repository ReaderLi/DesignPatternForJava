package com.lrd.CompositePattern;


public class MenuTest {

    public static void main(String[] args) {
        //create all menus
        MenuComponent pancakeHouseMenu =
                new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinerMenu =
                new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu =
                new Menu("CAFE MENU","Diner");
        MenuComponent dessertMenu =
                new Menu("DESSERT MENU", "Dessert of course!");

        //the top menu
        MenuComponent allMenus
                = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        //add menuItems to menus

        pancakeHouseMenu.add(new MenuItem(
                "K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99
        ));
        pancakeHouseMenu.add(new MenuItem(
                "Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99
        ));
        pancakeHouseMenu.add(new MenuItem(
                "Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49
        ));


        dinerMenu.add(new MenuItem(
                "Vegetarian BLT",
                "(Fakin') Bacon with lettuce & tomato on whole wheat",
                true, 2.99
        ));

        dinerMenu.add(new MenuItem(
                "BLT",
                "Bacon with lettuce & tomato on whole wheat",
                false, 2.99
        ));
        dinerMenu.add(new MenuItem(
                "Soup of the day",
                "Soup of the day,with a side of potato salad",
                false, 3.29
        ));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "Apple Pie",
                "Apple pie with a flakey crust, topped with vanilla ice cream",
                true, 1.59
        ));

        cafeMenu.add(new MenuItem(
                "Veggie Burger and Air Fries",
                "Veggie burger on a whole wheat bun,lettuce,tomato,and fries",
                true,3.99
        ));
        cafeMenu.add(new MenuItem(
                "Soup of the day",
                "A cup of the soup of the day,with a side salad",
                false,3.69
        ));
        cafeMenu.add(new MenuItem(
                "Burrito",
                "A large burrito,with whole pinto beans,salsa,guacamole",
                true,4.29
        ));


        Waitress waitress = new Waitress(allMenus);
        //waitress.printMenu();
        waitress.printVegetarianMenu();

    }
}
