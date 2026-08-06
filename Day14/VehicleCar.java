
// Superclass (Parent Class)
class Vehicle {
    // Fields

    String brand;
    String color;

    // Constructor
    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
    // Method

    public void displayVehicle() {
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);

    }
}

class Car extends Vehicle {

    String model;

    public Car(String brand, String color, String model) {
        super(brand, color);
        this.model = model;
    }

    public void displayCar() {
        System.out.println("This " + color + " " + brand + " is a " + model + " model.");
    }
}

public class VehicleCar {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Red", "Fortuner");

        car.displayVehicle();

        car.displayCar();

    }
}
