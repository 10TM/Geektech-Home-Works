public abstract class Hero implements HavingSuperAbility{
    private int life;
    private int damage;

    private String superAbility;
    public Hero(int life, int damage){
        this.life = life;
        this.damage = damage;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public String info(){
        return getLife() + " " + getDamage();
    }

}
