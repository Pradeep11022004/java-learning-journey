
import java.util.Scanner;

public class PrimeNumberMethod {

    static boolean checkPrime(int num) {

        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;

        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
        

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");

        int number = sc.nextInt();

        if (checkPrime(number)) {
            System.out.println("Prime Number.");
        } else {
            System.out.println("Not Prime Number.");
        }

        sc.close();

    }
}
