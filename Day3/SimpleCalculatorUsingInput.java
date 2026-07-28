import java.util.Scanner;

public class SimpleCalculatorUsingInput{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Simple Calculator ==========");

        System.out.print("Enter First Number : ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter Second Number : ");
        int secondNumber = scanner.nextInt();

        System.out.println();

        System.out.println("Addition       : " + (firstNumber + secondNumber));
        System.out.println("Subtraction    : " + (firstNumber - secondNumber));
        System.out.println("Multiplication : " + (firstNumber * secondNumber));
        System.out.println("Division       : " + (firstNumber / secondNumber));
        System.out.println("Remainder      : " + (firstNumber % secondNumber));

        System.out.println("=======================================");

        scanner.close();
    }
}