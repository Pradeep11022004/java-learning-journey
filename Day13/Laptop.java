
public class Laptop {

   
    private String brand;
    private String processor;
    private int ram;
    private double price;


    public void setBrand(String brand) {
        if (brand != null && !brand.trim().isEmpty()) {
             this.brand = brand;
        }else{
            System.out.println("Brand cannot be empty.");
        }

       
    }

    public void setProcessor(String processor) {
        if (processor != null && !processor.trim().isEmpty()) {
            this.processor = processor;
        }else{
            System.out.println("Processor cannot be empty.");
        }
        
    }

    public void setRam(int ram) {
        if (ram > 0) {
           this.ram = ram;
        }else{
             System.out.println("RAM must be greater than 0.");
        }
        
    }

    public void setPrice(double price) {
        if (price > 0) {
             this.price = price;
        }else{
            System.out.println("Price must be greater than 0.");
        }
       
    }

    public String getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public double getPrice() {
        return price;
    }

    public void displayLaptop() {
        System.out.println("Brand : " + brand);
        System.out.println("Processor : " + processor);
        System.out.println("RAM : " + ram + " GB");
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setBrand("HP");
        laptop.setProcessor("Ryzen 5");
        laptop.setRam(16);
        laptop.setPrice(55000.99);
       
        laptop.displayLaptop();
    }
}
