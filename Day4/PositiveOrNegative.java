import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Positive or Negative =====");

        System.out.print("Enter a Number : ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is Positive.");
        } else if (number < 0) {
            System.out.println(number + " is Negative.");
        } else {
            System.out.println("The Number is Zero.");
        }

        System.out.println("===============================");

        scanner.close();
    }
}