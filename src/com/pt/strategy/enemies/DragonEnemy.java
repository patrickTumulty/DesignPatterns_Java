package com.pt.strategy.enemies;

import com.pt.strategy.behaviors.FireAttack;

public class DragonEnemy extends Enemy {
    public DragonEnemy(String name) {
        this.name = name;
        attackBehavior = new FireAttack();
    }
}
