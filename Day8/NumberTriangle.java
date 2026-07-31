
public class NumberTriangle {

    public static void main(String[] args) {
        System.out.println("===== Print Number Triangle Pattern Using Nested Loop =====");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
        System.out.println("===================================");
    }
}
