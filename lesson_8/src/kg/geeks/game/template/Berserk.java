package kg.geeks.game.template;

import static kg.geeks.game.template.SuperAbility.BLOCK_DAMAGE_AND_REVERT;

public class Berserk extends Hero {
    private int blockedDamage;

    public Berserk(String name, int health, int damage) {
        super(name, health, damage, String.valueOf(BLOCK_DAMAGE_AND_REVERT));
    }

    public void setBlockedDamage(int blockedDamage) {
        this.blockedDamage = blockedDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boss.setHealth(boss.getHealth() - blockedDamage);
        System.out.println("Berserk " + this.getName() + " reverted " + blockedDamage + " damage");
    }
}
