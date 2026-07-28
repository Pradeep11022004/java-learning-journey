import java.util.Scanner;

public class LoginValidation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username : ");
        String username = scanner.nextLine();

        System.out.print("Enter Password : ");
        int password = scanner.nextInt();

        if (username.equals("admin") && password == 1234) {
            System.out.println("Login Successful.");
        } else {
            System.out.println("Invalid Username or Password.");
        }

        scanner.close();
    }
}