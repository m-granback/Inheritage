public class Motorcycle extends Vehicle implements TireChangeInterface{

    private boolean hasKick;

    public Motorcycle(int weight, String color, boolean hasKick) {
        super(weight, color);
        this.hasKick = hasKick;
    }

    @Override
    public void start() {
        String action = "by turning ignition";
        if(hasKick){
            action = "by using the kick";
        }
        System.out.println("Motorcycle starts " + action);
    }

    @Override
    public void mot() {
        System.out.println("Besiktas genom att lyftas på ett lyftbord");
    }

    public boolean isHasKick() {
        return hasKick;
    }

    public void setHasKick(boolean hasKick) {
        this.hasKick = hasKick;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasKick=" + hasKick +
                '}';
    }

    @Override
    public void changeTire() {
        System.out.println("Changing two tires");
    }
}
