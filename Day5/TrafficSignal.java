import java.util.Scanner;

public class TrafficSignal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter signal color (Red/Yellow/Green): ");
        String signal = sc.next();

        switch (signal.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Ready");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid signal color.");
        }

        sc.close();
    }
}