
public class SecondSmallest {

    public static void main(String[] args) {
        int[] numbers = {10, 30, 20, 50, 40};
        int firstSmallest = numbers[0];

        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            if ( numbers[i]<firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = numbers[i];

            } else if ( numbers[i] < secondSmallest && firstSmallest != numbers[i]) {
                secondSmallest = numbers[i];
            }
        }
        System.out.println("Second Smallest : " + secondSmallest);
    }
}
