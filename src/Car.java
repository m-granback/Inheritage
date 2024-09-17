public class Car extends Vehicle implements TireChangeInterface{

    private boolean awd;

    public Car(int weight, String color) {
        super(weight, color);
    }

    public Car(int weight, String color, boolean awd) {
        super(weight, color);
        this.awd = awd;
    }

    @Override
    public void start() {
        System.out.println("Car starts by turning ignition");
    }

    @Override
    public void mot() {
        System.out.println("Bilen besiktas genom att lyftas med pelarlyft");
    }

    public boolean isAwd() {
        return awd;
    }

    public void setAwd(boolean awd) {
        this.awd = awd;
    }

    @Override
    public void changeTire() {
        System.out.println("Changing four tires");
    }
}
