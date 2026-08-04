
public class Car {

    String brand = "Bentley";
    String color = "Red";

     void showCar() {
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);

    }

    public static void main(String[] args) {
        Car car =new Car();
        car.showCar();

    }
}
