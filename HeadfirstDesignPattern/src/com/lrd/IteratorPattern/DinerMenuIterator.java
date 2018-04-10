package com.lrd.IteratorPattern;

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

        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
