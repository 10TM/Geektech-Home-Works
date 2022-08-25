package kg.nazar.players;

import kg.nazar.general.RPG_Game;

public class Thor extends Hero{

    public Thor(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.THUNDER_HUMMER);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean thorHummer = RPG_Game.random.nextBoolean();
        if (thorHummer){
            boss.setDamage(0);
                System.out.println("Boss in out");
        }else{
            boss.setDamage(50);
        }
    }

}
