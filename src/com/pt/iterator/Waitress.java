package com.pt.iterator;

public class Waitress {
    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("\nPancake House");
        printMenu(pancakeIterator);
        System.out.println("\nDiner");
        printMenu(dinerIterator);

    }

    private void printMenu(Iterator iterator) {

        /*
        The benefit here is we don't need to worry about the implementation of these two menus. DinerMenu is an
        Array and PancakeHouseMenu is an ArrayList. Using the iterator pattern, we can traverse both arrays
        without having to worry about their specific implementation.
         */


        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            System.out.print(item.getName() + ", ");
            System.out.print(item.getPrice() + " -- ");
            System.out.println(item.getDescription());
        }
    }
}
