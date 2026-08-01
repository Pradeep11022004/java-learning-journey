
public class CalculatorMethods {

    static double addition(double num1, double num2) {
        return num1 + num2;
    }

    static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    static double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }else{
        return num1 / num2;
    }
    }

    public static void main(String[] args) {

        double result = addition(2, 5);
        System.out.println("Addition : " + result);
        double result1 = subtraction(2, 5);
        System.out.println("Subtraction : " + result1);
        double result2 = multiplication(2, 5);
        System.out.println("Multiplication : " + result2);
        double result3 = division(2, 0);
        System.out.println("Division : " + result3);

    }
}
