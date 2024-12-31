public class Customer {
    private String name;
    private String id;
    private String email;
    private RentalTransaction currentRental;

    public Customer(String name, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    
    public String getId() {
        return name;
    }
    public String getEmail() {
        return email;
    }

    public RentalTransaction getCurrentRental() {
        return currentRental;
    }

    public void setCurrentRental(RentalTransaction currentRental) {
        this.currentRental = currentRental;
    }
}