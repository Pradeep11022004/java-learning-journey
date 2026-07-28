import java.util.Scanner;

public class CelsiusToFahrenheitUsingInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Celsius to Fahrenheit =====");

        System.out.print("Enter Temperature in Celsius : ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit : " + fahrenheit);

        System.out.println("=================================");

        scanner.close();
    }
}