public class Boss extends GameEntity {
    private Weapon weapon;

    public Boss(double health, String name, Weapon weapon) {
        super(health, name);
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Босс" +
                " Оружие=" + weapon +" "+
                " " + super.toString();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
