package kg.nazar.general;

import kg.nazar.game.GameEntity;
import kg.nazar.game.Boss;
import kg.nazar.game.Weapon;
import kg.nazar.game.WeaponType;

public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.MACHINE, " "+"AK-47");
        GameEntity boss = new Boss(300, " Босс", bossWeapon);

        System.out.println(boss);
    }
}