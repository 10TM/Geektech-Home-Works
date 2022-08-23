package kg.nazar;

public enum WeaponType {
    MACHINE(10.3),
    PISTOL(7.9),
    KNIFE(5.5);

    private final double damage;


    WeaponType(double damage) {
        this.damage = damage;
    }


    public double getDamage() {
        return damage;
    }

}
