
public class MultiplicationTableGrid {

    public static void main(String[] args) {
        System.out.println("===== Print Multiplication Table Using Nested Loop =====");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.printf("%-4d",i * j);
            }
            System.out.println();
        }
        System.out.println("===================================");
    }
}
