package com.pt.strategy.enemies;

import com.pt.strategy.behaviors.BiteAttack;

public class WolfEnemy extends Enemy {
    public WolfEnemy(String name) {
        this.name = name;
        attackBehavior = new BiteAttack();
    }
}
