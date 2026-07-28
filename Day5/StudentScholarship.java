import java.util.Scanner;

public class StudentScholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double INCOME_LIMIT = 200000.0;

        System.out.print("Enter marks (out of 100): ");
        double marks = sc.nextDouble();

        System.out.print("Enter family income: ");
        double income = sc.nextDouble();

        if (marks >= 90) {
            if (income < INCOME_LIMIT) {
                System.out.println("Eligible for Scholarship");
            } else {
                System.out.println("Not Eligible");
            }
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}