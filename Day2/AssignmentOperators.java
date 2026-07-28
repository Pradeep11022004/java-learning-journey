public class AssignmentOperators {

    public static void main(String[] args) {

        int number = 10;

        System.out.println("========== Assignment Operators ==========");

        System.out.println("Initial Value : " + number);

        number += 5;
        System.out.println("After += 5 : " + number);

        number -= 3;
        System.out.println("After -= 3 : " + number);

        number *= 2;
        System.out.println("After *= 2 : " + number);

        number /= 4;
        System.out.println("After /= 4 : " + number);

        number %= 3;
        System.out.println("After %= 3 : " + number);

        System.out.println("==========================================");
    }
}