package com.lrd.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;


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

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException(
                    "You can't remove an item until you're done at least one next()"
            );
        }

        if (menuItems.get(position-1) != null) {
            for (int i=position-1; i < (menuItems.size()-1); i++) {
                menuItems.set(i,menuItems.get(i+1));
            }
            menuItems.set(position-1,null);
        }
    }
}
