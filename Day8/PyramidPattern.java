
public class PyramidPattern {

    public static void main(String[] args) {
        System.out.println("===== Print Pyramid Pattern Using Nested Loop =====");

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* ");

            }

            System.out.println();
        }

        System.out.println("===================================");

    }
}
