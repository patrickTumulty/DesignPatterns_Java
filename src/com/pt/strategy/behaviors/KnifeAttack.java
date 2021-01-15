package com.pt.strategy.behaviors;

public class KnifeAttack implements AttackBehavior {

    @Override
    public void attack() {
        System.out.println("Attack with a knife!");
    }
}
