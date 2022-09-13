package kg.nazar.players;

import kg.nazar.general.Hero;

public class Medic extends Hero {
    public Medic(int life, int damage){
        super(life, damage);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Доктор ударил супер-ударом");
    }

    public String info(){
        return super.info();
    }
}
