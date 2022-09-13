package kg.nazar.general;

import kg.nazar.players.Magic;
import kg.nazar.players.Medic;
import kg.nazar.players.Warrior;

public class Main {
    public static void main(String[] args) {
       Magic strange = new Magic(450,100);
       Medic doctor = new Medic(300,100);
       Warrior wolverine = new Warrior(650,350,200);

       Hero[] heroes ={wolverine, doctor, strange};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].info());

            heroes[i].applySuperAbility();
            if (heroes[i] == wolverine) {
                System.out.println(wolverine.increaseExpierence());
            }
        }
    }
}