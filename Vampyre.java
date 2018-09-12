package com.goldspacebear.learnjavapt2;

public class Vampyre extends Enemy {
    public Vampyre(String name) {
        super(name, 20, 1);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage / 2);
    }
}
