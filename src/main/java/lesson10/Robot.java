package lesson10;

public class Robot {
    String name;
    String model;
    int lifetime;

    public Robot() {
        this.name = "Anonimus";
        this.model = "Unknown";
    }
    public Robot (String name, String model) {
        this(name, model, 20);
    }

    public Robot(String name, String model, int lifetime) {
        this.name = name;
        this.model = model;
        this.lifetime = lifetime;
    }

}
