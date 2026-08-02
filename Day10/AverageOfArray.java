
public class AverageOfArray {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        double average = numbers.length;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

        }
        System.out.println("Average = " + sum / average);
    }
}
