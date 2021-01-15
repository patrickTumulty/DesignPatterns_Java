package com.pt.strategy.enemies;

import com.pt.strategy.behaviors.AttackBehavior;

public class Enemy {
    protected int health;
    protected String name;
    protected AttackBehavior attackBehavior;

    public Enemy() {

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void performAttack() {
        attackBehavior.attack();
    }


}
