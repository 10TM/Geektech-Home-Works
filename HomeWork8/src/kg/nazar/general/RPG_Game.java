package kg.nazar.general;

import kg.nazar.players.*;

import java.util.Random;

public class RPG_Game {
    private static int roundNumber;
    public static Random random = new Random();

    public static void startGame() {
        Boss boss = new Boss(1000, 50, "Thanos");
        Warrior warrior = new Warrior(270, 10, "Assassin");
        Medic doc = new Medic(250, 5, 15, "Morpheus");
        Magic magic = new Magic(260, 15, "Merlin");
        Berserk berserk = new Berserk(280, 20, "Hulk");
        Medic assistant = new Medic(290, 10, 5, "Strange");
        Thor thor = new Thor(300,40,"Thor");
        Alukard alukard = new Alukard(250,20,"Blade");
        Hacker hacker = new Hacker(230,20,"Snowden");
        Golem golem = new Golem(200,30,"Frank");
        Hero[] heroes = {warrior, doc, magic, berserk, assistant, thor};

        printStatistics(boss, heroes);

        while (!isGameFinished(boss, heroes)) {
            playRound(boss, heroes);
        }
    }

    private static void playRound(Boss boss, Hero[] heroes) {
        roundNumber++;
        boss.chooseDefence(heroes);
        boss.hit(heroes);
        for (int i = 0; i < heroes.length; i++) {
            if (boss.getDefence() != heroes[i].getAbility()) {
                heroes[i].hit(boss);
                heroes[i].applySuperPower(boss, heroes);
            }
        }
        printStatistics(boss, heroes);
    }

    private static void printStatistics(Boss boss, Hero[] heroes) {
        System.out.println("----------- ROUND " +
                (roundNumber == 0 ? "BEFORE FIGHT " : roundNumber)
                + " -----------");
        System.out.println(boss);
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i]);
        }
    }

    private static boolean isGameFinished(Boss boss, Hero[] heroes) {
        if (boss.getHealth() <= 0) {
            System.out.println("Heroes won!!!");
            return true;
        }
        boolean allHeroesDead = true;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                allHeroesDead = false;
                break;
            }
        }
        if (allHeroesDead) {
            System.out.println("Boss won!!!");
        }
        return allHeroesDead;
    }
}
