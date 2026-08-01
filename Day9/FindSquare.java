
public class FindSquare {

    static int findSquare(int num) {
        return num * num;
    }

    public static void main(String[] args) {

        int result = findSquare(6);
        System.out.println("Square = " + result);
        System.out.println("Square = "+findSquare(3));
        System.out.println("Square = "+findSquare(-4));
    }
}
