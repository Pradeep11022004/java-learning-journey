
import java.util.Scanner;

public class MenuDrivenProgram {

    public static void main(String[] args) {

        System.out.println("===== Menu Drive Program Using Do While Loop =====");

        Scanner sc = new Scanner(System.in);

        System.out.println();
        int choice;

        do {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    double sub1 = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    double sub2 = sc.nextDouble();
                    System.out.println("Result: " + (sub1 - sub2));
                    break;
                case 3:
                     System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please select 1, 2, or 3.");
            }

        } while (choice != 3);

         System.out.println("===================================");
        sc.close();

    }
}
