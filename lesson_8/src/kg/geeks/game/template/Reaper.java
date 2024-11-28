package kg.geeks.game.template;

public class Reaper extends Hero {
    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    private int maxHealth;

    public Reaper(String name, int health, int damage, String ability, int maxHealth) {
        super(name, health, damage, ability);

    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }

    public void attack(Boss boss) {
        boss.setHealth(boss.getHealth() - this.getDamage());
        int actualDamage = getDamage();
        if (getHealth() < getMaxHealth() * 0.15) {
            actualDamage *= 3;
        } else if (getHealth() < getMaxHealth() * 0.3) {
            actualDamage *= 2;
        }
        boss.takeDamage(actualDamage);
    }
}
