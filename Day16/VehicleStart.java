abstract class Vehicle {

    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with a key.");
    }
}

class Bike extends Vehicle {

    @Override
    void start() {
        System.out.println("Bike starts with a self-start button.");
    }
}

public class VehicleStart {

    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();

        car.start();
        car.stop();

        bike.start();
        bike.stop();
    }
}