
public class RightTrianglePattern {

    public static void main(String[] args) {

       System.out.println("===== Print Right Triangle Pattern Using Nested Loop =====");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
              
            }
            System.out.println();
        }
        System.out.println("===================================");

    }
}
