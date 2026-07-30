
import java.util.Scanner;

public class FactorialWhile {

    public static void main(String[] args) {
        System.out.println("===== Print The Factorial =====");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        System.out.println();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");

        } else {
            int fact = 1;

            int i = 1;
            while (i <= num) {

                fact *= i;
                i++;

            }
            System.out.println(fact);

            System.out.println("===================================");
            sc.close();
        }
    }
}
