public abstract class Vehicle {
    private int weight;
    protected String color;

    public Vehicle(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public void start(){
        System.out.println("Fordonet startar...");
    }

    public abstract void mot();

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
