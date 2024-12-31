public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private String brand;
    private double baseRentalRate;
    private double calculateRentalCost;
    private int noOfAvailableCar;
    private boolean isAvailable;
    private boolean available;
    
    
    public Vehicle(String vehicleId, String model, double baseRentalRate) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.brand = brand;
        this.baseRentalRate = baseRentalRate;
        this.calculateRentalCost = calculateRentalCost;
        this.noOfAvailableCar = noOfAvailableCar;
        this.isAvailable = true;
        this.available =true;
    }
     

    public abstract double calculateRentalCost(int days);

    public boolean isAvailableForRental() {
        return isAvailable;
    }
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public void setAvailability(boolean availability) {
        isAvailable = availability;
    }

    public String getVehicleId() {
        return vehicleId;
    
    }
    
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    public String getBrand() {
        return brand;
    
   }
   
    public void setBrand(String brand) {
        this.brand = brand;
    }


    public double getBaseRentalRate() {
        return baseRentalRate;
    }
    
    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }
    
    public double getCalculateRentalCost() {
        return calculateRentalCost;
    }
    
    public void setCalculateRentalCost(double calculateRentalCost) {
        this.calculateRentalCost = calculateRentalCost;
    }
    
    public int getNoOfAvailableCar() {
        return noOfAvailableCar;
    }
    public void setNoOfAvailableCar(int noOfAvailableCar) {
        this.noOfAvailableCar = noOfAvailableCar;
    }

}