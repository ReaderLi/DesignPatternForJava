package com.lrd.IteratorPattern;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {

    ArrayList<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items){
        this.menuItems = items;
    }


    @Override
    public boolean hasNext() {
        if (position >= menuItems.size()
                ||menuItems.get(position) == null
                ) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position = position + 1;
        return menuItem;
    }
}
