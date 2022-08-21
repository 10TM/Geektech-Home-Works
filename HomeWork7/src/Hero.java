public abstract class Hero implements HavingSuperAbility{
    private int life;
    private int get_damage;
    private String power;

    public int getGet_damage() {
        return get_damage;
    }

    public int getLife() {
        return life;
    }

    public String getPower() {
        return power;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setGet_damage(int get_damage) {
        this.get_damage = get_damage;
    }

}
