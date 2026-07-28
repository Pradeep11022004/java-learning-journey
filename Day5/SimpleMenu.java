
import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- Simple Menu -----");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        // If invalid choice, no need to ask for numbers
        if (choice < 1 || choice > 4) {
            System.out.println("Invalid choice. Please select a number between 1 and 4.");
            sc.close();
            return;
        }

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        double result = 0;
        boolean valid = true;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    valid = false;
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
                }
                break;
        }

        sc.close();
    }
}