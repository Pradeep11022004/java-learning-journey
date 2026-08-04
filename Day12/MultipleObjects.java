public class MultipleObjects {

    public static void main(String[] args) {

        // Creating three different Car objects
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);
        Car car3 = new Car("Ford", "Mustang", 2023);

        // Display each object's details
        car1.display();
        car2.display();
        car3.display();
    }
}

class Car {

    String brand;
    String model;
    int year;

    // Constructor
    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Car -> Brand: " + brand + ", Model: " + model + ", Year: " + year);
    }
}