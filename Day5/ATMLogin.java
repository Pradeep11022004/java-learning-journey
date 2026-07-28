import java.util.Scanner;

public class ATMLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int CORRECT_PIN = 1234;
        double balance = 5000.0;

        System.out.print("Enter your PIN: ");
        int pin = sc.nextInt();

        if (pin == CORRECT_PIN) {
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Your balance is: " + balance);
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();

                if (amount <= 0) {
                    System.out.println("Invalid withdrawal amount.");
                } else if (amount > balance) {
                    System.out.println("Insufficient balance.");
                } else {
                    balance -= amount;
                    System.out.println("Withdrawal successful. Remaining balance: " + balance);
                }
            } else if (choice == 3) {
                System.out.println("Thank you for using the ATM. Goodbye!");
            } else {
                System.out.println("Invalid choice.");
            }

        } else {
            System.out.println("Invalid PIN");
        }

        sc.close();
    }
}