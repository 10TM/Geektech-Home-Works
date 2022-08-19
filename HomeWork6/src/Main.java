public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.MACHINE, " "+"AK-47");
        GameEntity boss = new Boss(300, " Босс", bossWeapon);

        System.out.println(boss);
    }
}