package com.goldspacebear.learnjavapt2;

import java.util.Random;

public class VampyreKing extends Vampyre {
    public VampyreKing(String name) {
        super(name);
        setHitPoints(140);
        setLives(3);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage / 2);
    }

    public boolean runAway(){
//        if (getLives() < 2){
//            return true;
//        } else {
//            return false;
//        }
        return (getLives() < 2);
    }

    public boolean dodges(){
        Random random = new Random();
        int chance = random.nextInt(6);
        if (chance > 3){
            System.out.println("You miss your attack");
            return true;
        }
        return false;
    }
}
