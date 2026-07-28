import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Add Two Numbers ==========");

        System.out.print("Enter First Number : ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter Second Number : ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;

        System.out.println("Sum : " + sum);

        System.out.println("=====================================");

        scanner.close();
    }
}