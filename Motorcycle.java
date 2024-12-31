public class Motorcycle extends Vehicle implements Rentable{
    private int engineCapacity;
    
    public Motorcycle(String vehicleId, String model, double baseRentalRate, int engineCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.engineCapacity = engineCapacity;
    }
    @Override
    public double calculateRentalCost(int days) {
        return super.getBaseRentalRate() * days + (engineCapacity > 650 ? 20 : 0);
    }

   @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailability(false);
            System.out.println("Motorcycle rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("Motorcycle is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailability(true);
        System.out.println("Motorcycle returned.");
    }
}
