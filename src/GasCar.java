public class GasCar extends Car{
    private String fuel;

    public GasCar(int weight, String color, boolean awd, String fuel) {
        super(weight, color, awd);
        this.fuel = fuel;
    }
    public void reFuel(){

    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
