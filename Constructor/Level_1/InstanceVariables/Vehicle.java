package Constructor.Level_1.InstanceVariables;

public class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle.updateRegistrationFee(250.0);

        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Motorcycle");

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(300.0);
        System.out.println("\nAfter updating registration fee:\n");

        v1.displayVehicleDetails();
        System.out.println();
        v2.displayVehicleDetails();
    }
}
