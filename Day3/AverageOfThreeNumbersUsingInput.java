import java.util.Scanner;

public class AverageOfThreeNumbersUsingInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Average of Three Numbers =====");

        System.out.print("Enter First Number : ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter Second Number : ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter Third Number : ");
        int thirdNumber = scanner.nextInt();

        double average = (firstNumber + secondNumber + thirdNumber) / 3.0;

        System.out.println("Average : " + average);

        System.out.println("====================================");

        scanner.close();
    }
}