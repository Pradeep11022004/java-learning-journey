
public class FloydTriangle {

    public static void main(String[] args) {

        System.out.println("===== Print Floyd Triangle Number Pattern Using Nested Loop =====");

        int number = 1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        System.out.println("===================================");
    }
}
