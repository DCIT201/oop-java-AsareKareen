public class Truck extends Vehicle implements Rentable{
    private int payloadCapacity;

    public Truck(String vehicleId, String model, double baseRentalRate, int payloadCapacity) {
        super(vehicleId, model, baseRentalRate);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return super.getBaseRentalRate() * days + (payloadCapacity > 2000 ? 30 : 0);
    }

    @Override
    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            setAvailability(false);
            System.out.println("Truck rented to " + customer.getName() + " for " + days + " days.");
        } else {
            System.out.println("Truck is not available for rental.");
        }
    }

    @Override
    public void returnVehicle() {
        setAvailability(true);
        System.out.println("Truck returned.");
    }
}