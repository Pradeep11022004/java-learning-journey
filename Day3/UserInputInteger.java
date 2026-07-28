import java.util.Scanner;

public class UserInputInteger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== User Input Integer ==========");
        System.out.print("Enter an Integer: ");

        int number = scanner.nextInt();

        System.out.println("You Entered : " + number);
        System.out.println("========================================");

        scanner.close();
    }
}