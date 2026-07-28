import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Voting Eligibility =====");

        System.out.print("Enter Your Age : ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are Eligible to Vote.");
        } else {
            System.out.println("You are Not Eligible to Vote.");
        }

        System.out.println("==============================");

        scanner.close();
    }
}