import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Marks : ");
        int marks = scanner.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade : A");
        } else if (marks >= 80) {
            System.out.println("Grade : B");
        } else if (marks >= 70) {
            System.out.println("Grade : C");
        } else if (marks >= 60) {
            System.out.println("Grade : D");
        } else if (marks >= 35) {
            System.out.println("Grade : E");
        } else if (marks >= 0) {
            System.out.println("Grade : F");
        } else {
            System.out.println("Invalid Marks.");
        }

        scanner.close();
    }
}