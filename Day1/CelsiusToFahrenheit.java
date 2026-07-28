public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        int celsius = 30;
        double fahrenheit = (celsius * 9.0 / 5) + 32;

        System.out.println("========== Celsius to Fahrenheit ==========");

        System.out.println("Temperature in Celsius    : " + celsius + "°C");
        System.out.println("Temperature in Fahrenheit : " + fahrenheit + "°F");

        System.out.println("===========================================");
    }
}