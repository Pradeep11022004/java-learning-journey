import java.util.Scanner;

public class LargestOfTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Largest of Two Numbers =====");

        System.out.print("Enter First Number : ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter Second Number : ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is Larger.");
        } else if (secondNumber > firstNumber) {
            System.out.println(secondNumber + " is Larger.");
        } else {
            System.out.println("Both Numbers are Equal.");
        }

        System.out.println("==================================");

        scanner.close();
    }
}