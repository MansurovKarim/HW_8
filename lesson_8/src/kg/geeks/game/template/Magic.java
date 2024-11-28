package kg.geeks.game.template;

public class Magic extends Hero {
    public Magic(String name, int health, int damage) {
        super(name, health, damage, String.valueOf(SuperAbility.BOOST));
    }
private int roundCounter;
    private final int maxRound = 4;
    private int increaseDamage;
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        // TODO Here will be implementation of BOOSTING
        if(roundCounter < maxRound){
            for(Hero hero : heroes){
                hero.setDamage(hero.getDamage() + increaseDamage);
            }
            System.out.println("Magic " + getName() + " Увеличил урон героя на раунд " + (roundCounter + roundCounter++));
        }else{
            System.out.println("Magic " + getName() + " Не смог увеличить урон героя ");
        }
    }
}
