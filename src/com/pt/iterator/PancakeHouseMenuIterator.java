package com.pt.iterator;

import java.awt.*;
import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public MenuItem next() {
        MenuItem nextItem = menuItems.get(position);
        position++;
        return nextItem;
    }
}
