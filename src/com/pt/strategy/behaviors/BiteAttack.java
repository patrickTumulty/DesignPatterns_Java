package com.pt.strategy.behaviors;

public class BiteAttack implements AttackBehavior {

    @Override
    public void attack() {
        System.out.println("Attack with bite!");
    }
}
