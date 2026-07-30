
import java.util.Scanner;

public class PasswordValidationDoWhile {

    public static void main(String[] args) {

       System.out.println("===== Password Validation Using Do While Loop =====");

        Scanner sc = new Scanner(System.in);

        System.out.println();

        final int PASSWORD = 1234;
        int enteredPassword;

        do {
            System.out.print("Enter Password: ");
            enteredPassword = sc.nextInt();

            if (enteredPassword != PASSWORD) {
                System.out.println("Incorrect Password.\n");
            } else {
                System.out.println("Login Successful.");
            }
        } while (enteredPassword != PASSWORD);

        System.out.println("===================================");
        sc.close();

    }
}
