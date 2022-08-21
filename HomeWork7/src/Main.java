public class Main {
    public static void main(String[] args) {
       Magic strange = new Magic();
       strange.applySuperAbility();
       Medic doctor = new Medic();
       doctor.applySuperAbility();
       Warrior wolverine = new Warrior();
       wolverine.applySuperAbility();
       wolverine.setLife(150);
       doctor.setLife(90);
       strange.setLife(120);

       Hero[] heroes ={wolverine, doctor, strange};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(wolverine.increaseExperience() +" "+i);
        }
    }
}