
import java.util.Scanner;

public class StudentResult {

    public static int calculateTotal(int mark1, int mark2, int mark3) {
        return mark1 + mark2 + mark3;
    }

    public static double calculateAverage(int total) {
        return total / 3.0;
    }

    public static String calculateGrade(double markAvg) {
        if (markAvg < 0 || markAvg > 100) {
            return "Invalid Mark";
        } else if (markAvg >= 90) {
            return "A";
        } else if (markAvg >= 80) {
            return "B";
        } else if (markAvg >= 70) {
            return "C";
        } else if (markAvg >= 60) {
            return "D";
        } else if (markAvg >= 35) {
            return "E";
        } else {
            return "F";
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Student Result =====");

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Tamil Marks :");
        int mark1 = sc.nextInt();
        System.out.print("Enter English Marks :");
        int mark2 = sc.nextInt();
        System.out.print("Enter Maths Marks :");
        int mark3 = sc.nextInt();

        System.out.println();

        int total = calculateTotal(mark1, mark2, mark3);
        double average = calculateAverage(total);
        String grade = calculateGrade(average);

        System.out.println("Student Name : " + name);
        System.out.println("Total Mark   :" + total);
        System.out.println("Average      :" + average);
        System.out.println("Grade        :" + grade);

        System.out.println("==========================");

        sc.close();

    }
}
