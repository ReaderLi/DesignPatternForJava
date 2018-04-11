package com.lrd.IteratorPattern;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.menuItems = items;

    }
    @Override
    public boolean hasNext() {

        if (position >= menuItems.length ||
                menuItems[position] == null) {
            return false;
        }else {
            return true;
        }


    }

    @Override
    public Object next() {

        if (hasNext()) {
            MenuItem menuItem = menuItems[position];
            position++;
            return menuItem;
        }else {
            return null;
        }

    }

    @Override
    public void remove() {
        if (position <= 0) {
            throw new IllegalStateException(
                    "You can't remove an item until you're done at least one next()"
            );
        }

        if (menuItems[position-1] != null) {
            for (int i=position-1; i < (menuItems.length-1); i++) {
                menuItems[i] = menuItems[i+1];
            }
            menuItems[position-1] = null;
        }
    }






}

