public class Mobile{

    String brand = "OnePlus";
    int price = 25000;

    void showDetails(){
        System.out.println("Brand : "+brand);
        System.out.println("Price : "+price);
    }
    public static void main(String[] args) {
        
        Mobile mobile =new Mobile();
        mobile.showDetails();
    }
}