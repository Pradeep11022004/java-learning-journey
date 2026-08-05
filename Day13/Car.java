
public class Car {

    private String brand;
    private String model;
    private int year;

    public void setBrand(String brand) {
        if (brand != null && !brand.trim().isEmpty()) {
            this.brand = brand.trim();
        } else {
            System.out.println("Invalid Brand Name.");
        }
    }

    public void setModel(String model) {
        if (model != null && !model.trim().isEmpty()) {
            this.model = model.trim();
        } else {
            System.out.println("Invalid Model Name.");
        }
    }

    public void setYear(int year) {
        if (year >= 1900 && year <= 2026) {
            this.year = year;
        } else {
            System.out.println("Invalid Year.");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;

    }

    public int getYear() {
        return year;
    }

    public void displayCar() {
        System.out.println("Car Brand Name : " + getBrand());
        System.out.println("Car Model Name : " + getModel());
        System.out.println("Car Made Year  : " + getYear());

    }

    public static void main(String[] args) {

        Car c = new Car();
        c.setBrand("BMW");
        c.setModel("mustang");
        c.setYear(2024);

        c.displayCar();

    }
}
