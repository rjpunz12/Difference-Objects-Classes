// Define a class "Car" with attributes and methods
class Car {
    // Properties of the class (these are the attributes of the car)
    String make;
    String model;
    int year;
    
    // Constructor to initialize the object with its attributes
    Car(String make, String model, int year) {
        this.make = make;  // "this" refers to the current object's attributes
        this.model = model;
        this.year = year;
    }
    
    // Method to display car details
    void displayInfo() {
        System.out.println("Car: " + make + " " + model + " (" + year + ")");
    }
    
    // Method to simulate starting the car
    void startCar() {
        System.out.println("The car is starting...");
    }
}

public class DifferenceObjectsClasses {
    public static void main(String[] args) {
        // Creating objects (instances) of the Car class
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Ford", "Mustang", 1967);
        
        // Displaying the object details
        car1.displayInfo();  // Output: Car: Toyota Corolla (2020)
        car2.displayInfo();  // Output: Car: Ford Mustang (1967)
        
        // Starting the cars
        car1.startCar();  // Output: The car is starting...
        car2.startCar();  // Output: The car is starting...
    }
}
