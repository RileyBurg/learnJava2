package com.goldspacebear.learnjavapt2;

public class Demo {
    public static void main(String[] args) {
        Enemy enemy = new Enemy("Test Enemy", 10, 3);
        enemy.showInfo();
        enemy.takeDamage(3);
        enemy.showInfo();
        enemy.takeDamage(11);
        enemy.showInfo();

        Troll troll = new Troll("Ugly Troll");
        troll.showInfo();
        troll.takeDamage(100);

        Vampyre edward = new Vampyre("sparkles");
        edward.showInfo();
        edward.takeDamage(8);
        edward.showInfo();

        VampyreKing drac = new VampyreKing("Dracula");
        drac.showInfo();
        while (drac.getLives() > 0){
            if (drac.dodges()){
                continue;
            }
            if (drac.runAway()){
                System.out.println("Dracula ran away!");
                break;
            } else {
                drac.takeDamage(12);
                drac.showInfo();
            }
        }
    }
}
