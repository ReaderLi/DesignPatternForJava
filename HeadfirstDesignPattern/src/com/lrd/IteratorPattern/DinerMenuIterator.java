package com.lrd.IteratorPattern;

<<<<<<< HEAD
import java.util.Iterator;

=======
>>>>>>> b1e929a690aba299c689566aea971e61abf037f8
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
<<<<<<< HEAD

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
=======
}
>>>>>>> b1e929a690aba299c689566aea971e61abf037f8
