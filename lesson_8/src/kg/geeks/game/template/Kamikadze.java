package kg.geeks.game.template;

public class Kamikadze extends Hero {
    private int exactHit;

    public Kamikadze(String name, int health, int damage, String ability, int exactHit) {
        super(name, health, damage, ability);
        this.exactHit = exactHit;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() > 0) {
            int harm = (Math.random() < exactHit) ? this.getHealth() : this.getHealth() / 2;
            boss.getDamage();
            System.out.println("Kamikadze жертвует собой, и " + harm + " урона наносит");
            this.setHealth(0);
        }
    }
}
