
import java.util.Scanner;

public class GuessNumberDoWhile {

    public static void main(String[] args) {

        System.out.println("===== Guess Number Challenge Using Do While Loop =====");

        Scanner sc = new Scanner(System.in);

        
        

        final int SECRET_NUMBER = 7;
        int guess;

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess != SECRET_NUMBER) {
                System.out.println("Wrong! Try Again.\n");
            } else {
                System.out.println("Correct!");
            }
        } while (guess != SECRET_NUMBER);

        System.out.println("===================================");
        sc.close();
    }
}
