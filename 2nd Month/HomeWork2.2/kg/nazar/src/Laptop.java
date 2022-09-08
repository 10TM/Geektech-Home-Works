public class Laptop extends Brand {
    private int cam;
    private String OS;
    private double Screen_Diagonal;


    public Laptop(String technic_name, String model, int memory, int cam, String OS, double screen_Diagonal) {
        super(technic_name, model, memory);
        this.cam = cam;
        this.OS = OS;
        Screen_Diagonal = screen_Diagonal;
    }

    public int getCam() {
        return cam;
    }

    public void setCam(int cam) {
        this.cam = cam;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public double getScreen_Diagonal() {
        return Screen_Diagonal;
    }

    public void setScreen_Diagonal(double screen_Diagonal) {
        Screen_Diagonal = screen_Diagonal;
    }

    @Override
    public void print() {
        System.out.println("Ноутбук");
    }
}
