package learn04;

// Base class (Superclass)
class Vehicles {
    // Method to start the vehicle
    void start() {
        System.out.println("Vehicle started");
    }

    // Method to stop the vehicle
    void stop() {
        System.out.println("Vehicle stopped");
    }
}

// Derived class (Subclass)
class Cars extends Vehicles {
    // Method overriding: overrides the superclass method
    @Override
    void start() {
        System.out.println("Car started");
    }
}

public class Overraiding {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Cars car = new Cars();

        // Calling methods on the object
        car.start(); // This will print "Car started"
        car.stop();  // This will print "Vehicle stopped"
    }
}
