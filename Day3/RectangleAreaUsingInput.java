import java.util.Scanner;

public class RectangleAreaUsingInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========== Rectangle Area ==========");

        System.out.print("Enter Length : ");
        int length = scanner.nextInt();

        System.out.print("Enter Width : ");
        int width = scanner.nextInt();

        int area = length * width;

        System.out.println("Area : " + area);

        System.out.println("====================================");

        scanner.close();
    }
}