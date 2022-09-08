public class SmartWatch extends Brand{


    public SmartWatch(String technic_name, String model, int memory, String style, int mode) {
        super(technic_name, model, memory);
        this.style = style;
        this.mode = mode;
    }

    private String style;
    private int mode;

    @Override
    public void print() {
        System.out.println("Смарт часы");
    }
}
