public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && !accountNumber.trim().isEmpty()) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Account Number cannot be empty.");
        }
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Account Holder cannot be empty.");
        }
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Initial Balance cannot be negative.");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit : " + amount);
            System.out.println("Balance : " + balance);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw : " + amount);
            System.out.println("Balance : " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public void displayAccount() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

     
        account.setAccountNumber("AC1001");
        account.setAccountHolder("Ravi Kumar");
        account.setBalance(5000);



        System.out.println("Balance : " + account.getBalance());

        account.deposit(1000);
        account.withdraw(2000);
        account.withdraw(10000);
        account.displayAccount();
    }
}