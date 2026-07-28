import java.util.Scanner;

public class PassOrFail {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Pass or Fail =====");

        System.out.print("Enter Your Marks : ");
        int marks = scanner.nextInt();

        if (marks >= 35 && marks <= 100) {
            System.out.println("Result : Pass");
        } else if (marks >= 0 && marks < 35) {
            System.out.println("Result : Fail");
        } else {
            System.out.println("Invalid Marks.");
        }

        System.out.println("========================");

        scanner.close();
    }
}