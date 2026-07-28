import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Even or Odd =====");

        System.out.print("Enter a Number : ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        System.out.println("=======================");

        scanner.close();
    }
}
