package kg.nazar.class_entity;

public class Auto {
    private final String mark;
    private final String model;
    private final int year;
    private final String type_Motor;
    private final Colors colors;


    public String getMark() {
        return mark;
    }

    public int getYear() {
        return year;
    }

    public String getType_Motor() {
        return type_Motor;
    }

    public Colors getColors() {
        return colors;
    }

    public String getModel() {
        return model;
    }

    public Auto(String mark, int year, String type_Motor, Colors colors, String model) {
        this.mark = mark;
        this.year = year;
        this.type_Motor = type_Motor;
        this.colors = colors;
        this.model = model;
    }

    public String getInfo() {
        return "\nMark: " + getMark() +
                "\nModel: " + getModel() +
                "\nYear: " + getYear() +
                "\nMotor type: " + getType_Motor() +
                "\nColor: " + getColors();
    }
}