import java.util.Scanner;

public class UserPersonalInfo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Personal Information ==========");

        System.out.print("Enter Name : ");
        String name = scanner.nextLine();

        System.out.print("Enter Age : ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter College : ");
        String college = scanner.nextLine();

        System.out.println();

        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("College : " + college);

        System.out.println("==========================================");

        scanner.close();
    }
}