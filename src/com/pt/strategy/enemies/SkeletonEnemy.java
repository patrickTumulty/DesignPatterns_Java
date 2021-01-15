package com.pt.strategy.enemies;

import com.pt.strategy.behaviors.KnifeAttack;

public class SkeletonEnemy extends Enemy {

    public SkeletonEnemy(String name) {
        this.name = name;
        attackBehavior = new KnifeAttack();
    }
}
