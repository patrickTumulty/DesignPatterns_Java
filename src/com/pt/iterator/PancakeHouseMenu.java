package com.pt.iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        createMenu();
    }

    private void createMenu() {
        addItem(new MenuItem("Pancake Breakfast", "Pancakes with butter and syrup", true, 6.00));
        addItem(new MenuItem("Eggs Breakfast", "Eggs, Bacon, Hash Brown, Toast", false, 12.50));
        addItem(new MenuItem("Waffle Breakfast", "It's like pancakes, but different", true, 85.60));
    }

    public void addItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
