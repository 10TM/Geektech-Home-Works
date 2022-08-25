package kg.nazar.players;

import kg.nazar.general.RPG_Game;

public class Hacker extends Hero {
    public Hacker(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.HACKER_TOOLS);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < RPG_Game.random.nextInt(1); i++) {

        }
        int health = RPG_Game.random.nextInt(50) + 1;
        boolean health1 = RPG_Game.random.nextBoolean();
        boss.setHealth(boss.getHealth() - health);
        if (health1) {
            boss.setHealth(boss.getHealth() - health);
            System.out.println("Boss Health: " + boss.getHealth());

            if (health1) {
                boss.setHealth(boss.getHealth() - health);
                int randomhealth = RPG_Game.random.nextInt(heroes.length);
                System.out.println("Boss Health: " + boss.getHealth());
                if (boss.getHealth() > 0) {
                    System.out.println(randomhealth + " Добавили +" + health);
                }
            } else {
                System.out.println("Жизнь босса не изменина:  " + boss.getHealth());
            }
        }
    }
}