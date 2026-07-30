public class OddNumbersWhile{
    public static void main(String[] args) {
         System.out.println("===== Print Odd Numbers Using While Loop (1 to 20) =====");

        int i = 1;
        while (i <= 20) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("===================================");
    }
}