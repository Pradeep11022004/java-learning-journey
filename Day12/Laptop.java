
public class Laptop {

    String brand = "HP VICTUS";
    String ram = "16 GB RAM";
    String processor = "AMD RYZEN 5 5000 SERIES";

    void displayLaptop() {
        System.out.println("Laptop Brand : " + brand);
        System.out.println("RAM Size       : " + ram);
        System.out.println("Laptop Processor : " + processor);
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.displayLaptop();
    }
}
