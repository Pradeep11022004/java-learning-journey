
class Vehicle {

   protected  String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    void displayBrand() {
        System.out.println("Brand : " + brand);
    }
}

class Car extends Vehicle {

    String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    void displayCar() {
        System.out.println("Model : " + model);
    }
}

class Motorcycle extends Vehicle {

    String type;

    public Motorcycle(String brand, String type) {
        super(brand);
        this.type = type;
    }

    void displayMotorcycle() {
        System.out.println("Type : " + type);
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Fortuner");
        Motorcycle bike = new Motorcycle("Yamaha", "Sports Bike");

        car.displayBrand();
        car.displayCar();

        System.out.println();

        bike.displayBrand();
        bike.displayMotorcycle();

    }
}
