
public class EvenOrOddMethod {

    static boolean isEven(int num) {

        return num % 2 == 0;

    }

    public static void main(String[] args) {

        int number = 8;
        if (isEven(number)) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");

        }
       

    }
}
