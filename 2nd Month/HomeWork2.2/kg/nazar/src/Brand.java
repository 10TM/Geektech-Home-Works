
public abstract class Brand implements Printable {
    private String technic_name;
    private String model;
    private int memory;

    public Brand(String technic_name, String model, int memory) {
        this.technic_name = technic_name;
        this.model = model;
        this.memory = memory;
    }

    public String getTechnic_name() {
        return technic_name;
    }

    public void setTechnic_name(String technic_name) {
        this.technic_name = technic_name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }


}
