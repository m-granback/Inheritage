public class ElectricCar extends Car{
    private double maxDistance;
    private double batteryCapacity;


    public ElectricCar(int weight, String color, boolean awd, double maxDistance, double batteryCapacity) {
        super(weight, color, awd);
        this.maxDistance = maxDistance;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void start() {
        System.out.println("Bara att trampa på gasen...");
    }

    public void charge(){
        System.out.println("Laddar batterierna");
    }
    public void printColor(){
        System.out.println("This car is " + color);
    }

    public double getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(double maxDistance) {
        this.maxDistance = maxDistance;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
