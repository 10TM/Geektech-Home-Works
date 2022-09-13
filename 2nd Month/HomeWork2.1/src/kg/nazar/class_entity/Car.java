package kg.nazar.class_entity;

public class Car extends Auto {

    private final String body;
    private final int max_Speed;


    public Car(String mark, int year, String type_Motor, Colors colors, String model, String body, int max_Speed) {
        super(mark, year, type_Motor, colors, model);
        this.body = body;
        this.max_Speed = max_Speed;
    }

    public String getBody() {
        return body;
    }

    public int getMax_Speed() {
        return max_Speed;
    }

    public String getInfo() {
        return super.getInfo() +
                "\nBody: " + getBody() +
                "\nMax Speed: " + getMax_Speed();
    }
}
