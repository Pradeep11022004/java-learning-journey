
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Reverse Number =====");
        System.out.print("Enter a Numbers : ");
        int number = sc.nextInt();

        int reversed = 0;
        int n = number;

        while (n != 0) {
            int digit = n % 10;   // get the last digit
            reversed = reversed * 10 + digit;
            n = n / 10;           // remove the last digit
        }

        System.out.println("Reversed Number : "+reversed);
        sc.close();
        System.out.println("===================================");
    }
}