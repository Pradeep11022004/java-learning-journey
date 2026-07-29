
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("===== Print The Factorial =====");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int fact = 1;

            System.out.println();

            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + num + " = " + fact);

            sc.close();
            System.out.println("===================================");
        }
    }
}
