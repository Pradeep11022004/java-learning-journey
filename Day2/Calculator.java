public class Calculator {

    public static void main(String[] args) {

        int firstNumber = 25;
        int secondNumber = 5;

        System.out.println("========== Simple Calculator ==========");

        System.out.println("First Number  : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);

        System.out.println();

        System.out.println("Addition       : " + (firstNumber + secondNumber));
        System.out.println("Subtraction    : " + (firstNumber - secondNumber));
        System.out.println("Multiplication : " + (firstNumber * secondNumber));
        System.out.println("Division       : " + (firstNumber / secondNumber));
        System.out.println("Remainder      : " + (firstNumber % secondNumber));

        System.out.println("========================================");
    }
}