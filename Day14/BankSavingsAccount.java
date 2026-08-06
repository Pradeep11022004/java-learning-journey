
class BankAccount {

    double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println("Balance : " + balance);
    }
}

class SavingsAccount extends BankAccount {

    double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    void calculateInterest() {

        System.out.println("Interest Rate  : " + balance * interestRate / 100);

    }
}

public class BankSavingsAccount {

    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(10000.0, 5.0);

        account.displayBalance();
        account.calculateInterest();

    }
}
