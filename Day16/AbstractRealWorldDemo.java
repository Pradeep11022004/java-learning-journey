abstract class Payment {

    abstract void pay(double amount);

    void showMessage() {
        System.out.println("Processing Payment...");
    }
}

class UPIPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

class CardPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Card.");
    }
}

public class AbstractRealWorldDemo {

    public static void main(String[] args) {
        Payment payment;

        payment = new UPIPayment();
        payment.showMessage();
        payment.pay(1000);

        System.out.println();

        payment = new CardPayment();
        payment.showMessage();
        payment.pay(1000);
    }
}