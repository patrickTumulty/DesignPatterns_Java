package com.pt.template.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SortingExample {

    public void runExample() {
        Duck[] ducks = {
                new Duck("Daffy", 7),
                new Duck("Donald", 4),
                new Duck("Howard", 10),
                new Duck("Louie", 2),
                new Duck("Huey", 2),
                new Duck("Dewey", 3)
        };

        System.out.println("Before sorting");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting");
        display(ducks);

    }

    public void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
