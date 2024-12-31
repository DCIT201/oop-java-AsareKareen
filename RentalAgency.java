import java.util.ArrayList;
import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicles;
    private List<Customer> customers;
    private List<RentalTransaction> transactions;

    public RentalAgency() {
        vehicles = new ArrayList<>();
        customers = new ArrayList<>();
        transactions = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void rentVehicle(Customer customer, Vehicle vehicle, int days) {
        RentalTransaction transaction = new RentalTransaction(customer, vehicle, days);
        transactions.add(transaction);
        customer.setCurrentRental(transaction);
        vehicle.setAvailability(false);
    }

    public void returnVehicle(Vehicle vehicle) {
        for (RentalTransaction transaction : transactions) {
            if (transaction.getVehicle().equals(vehicle)) {
                transaction.getCustomer().setCurrentRental(null);
                vehicle.setAvailability(true);
                break;
            }
        }
    }

    public RentalTransaction getTransaction(Vehicle vehicle) {
        for (RentalTransaction transaction : transactions) {
            if (transaction.getVehicle().equals(vehicle)) {
                return transaction;
            }
        }
        return null;
    }
    public List<RentalTransaction> getTransactions() {
    return transactions;
}

public List<Vehicle> getAvailableVehicles() {
    List<Vehicle> availableVehicles = new ArrayList<>();
    for (Vehicle vehicle : vehicles) {
        if (vehicle.isAvailableForRental()) {
            availableVehicles.add(vehicle);
        }
    }
    return availableVehicles;
}
}