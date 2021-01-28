package com.pt.adapter.duckturkey;

/*
This adapter class has adapted the Turkey interface to
match the Duck interface. We now can use a Turkey as if it
were a Duck without changing the turkey code.
 */


public class TurkeyAdapter implements Duck {
    private final Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
