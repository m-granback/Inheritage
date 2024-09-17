import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        // Vehicle

        // Car MC

        List<Vehicle> listOfCars = new ArrayList<>();
        List<TireChangeInterface> listOfValidVehicles = new ArrayList<>();
        Motorcycle myBike = new Motorcycle(233,"red",true);
        Car myCar = new Car(2233,"black");
        Car myCar2 = new Car(2133,"red");
        listOfValidVehicles.add(myCar);
        listOfValidVehicles.add(myBike);
        listOfValidVehicles.add(myCar2);
        for (TireChangeInterface vehicle :
                listOfValidVehicles) {
            vehicle.changeTire();
        }


        Car car = new Car(2150, "red");
        car.start();

        Motorcycle mc = new Motorcycle(280, "black", false);
        mc.start();

        ElectricCar eCar = new ElectricCar(2400, "white", true,46.7,360.2);
        eCar.start();
        eCar.charge();

        listOfCars.add(car);
        listOfCars.add(eCar);

        for (int i = 0; i < listOfCars.size(); i++) {
            if(listOfCars.get(i) instanceof ElectricCar){
                ((ElectricCar) listOfCars.get(i)).printColor();
            }
            listOfCars.get(i).start();
        }

    }
}