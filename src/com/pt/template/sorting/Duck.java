package com.pt.template.sorting;




public class Duck implements Comparable<Duck> {
    private final String name;
    private final int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weighs " + weight + " lbs";
    }


    @Override
    public int compareTo(Duck otherDuck) {
        return Integer.compare(this.weight, otherDuck.weight);
    }
}
