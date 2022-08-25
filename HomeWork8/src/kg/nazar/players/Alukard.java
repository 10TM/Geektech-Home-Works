package kg.nazar.players;

public class Alukard extends Hero{
    public int getSave(){
        return save;
    }

    public void setSave(int save){
        this.save = save;
    }

    private int save;

    public Alukard(int health, int damage, String name) {
        super(health, damage, name, SuperAbility.BLOOD_CONTROL);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
    if (this.getHealth() > 0){
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() == 0 && this !=heroes[i]){
                heroes[i].setHealth(heroes[i].getHealth()+this.getHealth());
                break;
            }
        }
    }
    }
}
