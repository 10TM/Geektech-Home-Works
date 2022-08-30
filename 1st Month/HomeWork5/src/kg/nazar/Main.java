package kg.nazar;

public class Main {
    public static void main(String[] args) {
    Boss skeleton = new Boss();
    skeleton.setDamage(120);
    skeleton.setDefence("Shield");
    skeleton.setHealth(500);
        System.out.println(skeleton.getDamage() + " " + skeleton.getHealth() + " " + skeleton.getDefence());
        createHero();
        for (int i = 0; i < createHero().length; i++) {
            System.out.println(createHero()[i].getDamage(i) +" "+  createHero()[i].getDamage(i) +" "+ createHero()[i].getSuperpower());

        }
    }


    public static Hero[] createHero(){
        Hero Elf = new Hero(140,100,"MoreArrow");

        Hero doctor = new Hero(100,80,"Health");

        Hero berserk = new Hero(250,100,"Angry");

        Hero[] Hero = {Elf,doctor,berserk};
        return Hero;
    }
}