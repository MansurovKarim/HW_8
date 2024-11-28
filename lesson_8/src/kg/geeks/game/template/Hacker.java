package kg.geeks.game.template;

import java.util.Random;

public class Hacker extends Hero {

    public Hacker(String name, int health, int damage, String ability) {
        super(name, health, damage, ability);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int random1 = new Random().nextInt(heroes.length);
        int random2 = new Random().nextInt(100);
        boss.setHealth(boss.getHealth() - random2);
        heroes[random1].setHealth(heroes[random1].getHealth()+random2);

    }
}