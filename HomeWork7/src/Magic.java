public class Magic extends Hero{

    public Magic(int life, int damage){
        super(life, damage);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Стрендж ударил супер-ударом");
    }

    public String info(){
        return super.info();
    }
}
