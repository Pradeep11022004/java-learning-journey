public class BankValidation {

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
            System.out.println("Initial Balance must be 0 or greater.");
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
        if (amount <= 0) {
            System.out.println("Withdraw : " + amount);
            System.out.println("Invalid Withdraw Amount");
        } else if (amount > balance) {
            System.out.println("Withdraw : " + amount);
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdraw : " + amount);
            System.out.println("Balance : " + balance);
        }
    }

    public void displayAccount() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }

    public static void main(String[] args) {

        BankValidation account = new BankValidation();
        account.setAccountNumber("ACC101");
        account.setAccountHolder("Pradeep");
        account.setBalance(5000);

        account.displayAccount();
        System.out.println();

        account.deposit(1000);
        System.out.println();

        account.withdraw(1500);
        System.out.println();

        account.withdraw(-500);
        System.out.println();

        account.withdraw(10000);
    }
}