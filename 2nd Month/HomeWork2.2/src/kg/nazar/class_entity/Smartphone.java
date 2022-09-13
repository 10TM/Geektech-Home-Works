package kg.nazar.class_entity;

public class Smartphone extends Brand{

    public Smartphone(String technic_name, String model, int memory, int camera) {
        super(technic_name, model, memory);
        this.camera = camera;
    }

    private int camera;

    @Override
    public void print() {
        System.out.println("Смартфон");
    }
}
