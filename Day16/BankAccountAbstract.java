abstract class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void displayBalance() {
        System.out.println("Balance : " + balance);
    }

    abstract void withdraw(double amount);

    double getBalance() {
        return balance;
    }

    void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}

public class BankAccountAbstract {

    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(5000);

        account.deposit(1000);
        account.withdraw(2000);
        account.displayBalance();
    }
}