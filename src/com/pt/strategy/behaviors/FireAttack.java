package com.pt.strategy.behaviors;

public class FireAttack implements AttackBehavior {

    @Override
    public void attack() {
        System.out.println("Attack with fire!");
    }
}
