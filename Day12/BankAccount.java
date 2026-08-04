
public class BankAccount {

    String accountHolder = "Pradeep";
    double balance = 4000.0;

    void deposit(double amount) {

        System.out.println("Deposit Amount: " + amount);
        balance = balance + amount;
    }

    void withdraw(double amount) {

        System.out.println("Withdraw Amount:" + amount);
        if (amount <= balance) {
            balance = balance - amount;

        } else {
            System.out.println("Insufficient Balance.");
        }

    }

    void displayBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.displayBalance();

        account.deposit(500);

        account.displayBalance();

        account.withdraw(200);

        account.displayBalance();

    }
}
