public class Bike {
    private final String mark;
    private final String model;
    private final int max_speed;
    private final String type_Motor;

    public Bike(String mark, String model, int max_speed, String type_Motor) {
        this.mark = mark;
        this.model = model;
        this.max_speed = max_speed;
        this.type_Motor = type_Motor;
    }

    public String getInfo() {
        return "\nMark: " + mark +
                "\nModel: " + model +
                "\nMax speed: " + max_speed +
                "\nType Motor: " + type_Motor;
    }
}
