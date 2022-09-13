package kg.nazar.game;

public abstract class GameEntity {
    private double health;

    private String name;

    public GameEntity(double health, String name) {
        this.health = health;
        this.name = name;
    }

    @Override
    public String toString() {
        return  health + name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
