public class Car extends Vehicle implements Rentable {
    private int numberOfDoors;
    private boolean available;
    
    public boolean isBooked;
    
    public boolean isBooked() {
        return isBooked;
    }


    public Car(String vehicleId, String model, double baseRentalRate, int numberOfDoors) {
        super(vehicleId, model, baseRentalRate);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateRentalCost(int days) {
        return super.getBaseRentalRate() * days + (numberOfDoors > 4 ? 10 : 0);
    }
    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailability(false);
            System.out.println("Car rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("Car is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailability(true);
        System.out.println("Car returned.");
    }

}

    
