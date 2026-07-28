import java.util.Scanner;

public class LargestOfThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter Second Number : ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter Third Number : ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println(firstNumber + " is the Largest.");
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println(secondNumber + " is the Largest.");
        } else {
            System.out.println(thirdNumber + " is the Largest.");
        }

        scanner.close();
    }
}