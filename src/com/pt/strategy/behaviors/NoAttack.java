package com.pt.strategy.behaviors;

public class NoAttack implements AttackBehavior {

    @Override
    public void attack() {
        System.out.println("Can't attack");
    }
}
