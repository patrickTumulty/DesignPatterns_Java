package com.pt.strategy.enemies;

import com.pt.strategy.behaviors.NoAttack;

public class BlobEnemy extends Enemy {
    public BlobEnemy(String name) {
        this.name = name;
        attackBehavior = new NoAttack();
    }
}
