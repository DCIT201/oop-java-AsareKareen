
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarRentalService carRentalService = new CarRentalService();

        Car toyotaCar = new Car("CAR-1", "Toyota", 3000.0, 1);
        toyotaCar.setModel("Fortuner");
        toyotaCar.setNoOfAvailableCar(1);
        carRentalService.addCars(toyotaCar);

        Car tataCar = new Car("CAR-2", "Tata", 2000.0, 2);
        tataCar.setModel("Harier");
        tataCar.setNoOfAvailableCar(2);
        carRentalService.addCars(tataCar);

        Car mahindraCar = new Car("CAR-3", "Mahindra", 2500.0, 3);
        mahindraCar.setModel("XUV 700");
        mahindraCar.setNoOfAvailableCar(3);
        carRentalService.addCars(mahindraCar);

        carRentalService.options();
        toyotaCar.setNoOfAvailableCar(1);
        tataCar.setNoOfAvailableCar(2);
        mahindraCar.setNoOfAvailableCar(3);
    }
    
}