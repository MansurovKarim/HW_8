package kg.geeks.game.template;

public abstract class Hero extends GameEntity {
    private int health;
    private SuperAbility ability;

    public Hero(String name, int health, int damage, String ability) {
        super(name, health, damage);
        this.ability = SuperAbility.ability;
    }

    public boolean isAlive (){
        return health > 0;
    }


    public SuperAbility getAbility() {
        return ability;
    }

    public void attack(Boss boss) {
        boss.setHealth(boss.getHealth() - this.getDamage());
    }

    public abstract void applySuperPower(Boss boss, Hero[] heroes);

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + super.toString();
    }
}
