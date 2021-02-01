package com.pt.iterator;

import java.awt.*;

public class DinerMenu {
    public static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;
    private int position = 0;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        createMenu();
    }

    private void createMenu() {
        addItem(new MenuItem("Steak Dinner", "Steak, Potatoes, Greens", false, 23.00));
        addItem(new MenuItem("The Burger", "Burger with fries", false, 13.50));
        addItem(new MenuItem("Salad", "It's a salad... ", false, 18.50));

    }

    public void addItem(MenuItem menuItem) {
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Menu is Full!!");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        /* This iterator makes this method un-needed
         This method reveals our menuItems implementation which is something we
         don't want to do. The iterator pattern helps us iterate through a collection
         without revealing implementation.
        */
        return menuItems;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
