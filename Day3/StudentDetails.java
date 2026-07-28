import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Student Details ==========");

        System.out.print("Enter Name : ");
        String name = scanner.nextLine();

        System.out.print("Enter Age : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Department : ");
        String department = scanner.nextLine();

        System.out.print("Enter CGPA : ");
        double cgpa = scanner.nextDouble();

        System.out.println();

        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("Department : " + department);
        System.out.println("CGPA       : " + cgpa);

        System.out.println("=====================================");

        scanner.close();
    }
}