import java.util.Scanner;

public class NestedIfVoting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Do you have a Voter ID? (yes/no): ");
        String voterId = sc.next();

        if (age >= 18) {
            if (voterId.equalsIgnoreCase("yes")) {
                System.out.println("Eligible to Vote");
            } else {
                System.out.println("Not Eligible");
            }
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}