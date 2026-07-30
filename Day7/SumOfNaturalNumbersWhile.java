
import java.util.Scanner;

public class SumOfNaturalNumbersWhile {

    public static void main(String[] args) {
        System.out.println("===== Print Sum Of Natural Numbers Using While Loop  =====");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int sum = 0;

        int i = 0;

        while (i <= num) {

            sum += i;
            i++;

        }
        System.out.println(sum);

        System.out.println("===================================");
        sc.close();
    }
}
