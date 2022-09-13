package kg.nazar.players;

import kg.nazar.general.Hero;

public class Warrior extends Hero {

    private int healPoints;

    public int increaseExpierence() {
        int percent = (((10 * healPoints) / 100) + healPoints);
        return healPoints = percent;
    }

    public Warrior(int life, int damage, int healPoints) {
        super(life, damage);
        this.healPoints = healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = (int) healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Росомаха ударил супер-ударом");
    }

    public String info() {
        return super.info();
    }
}
