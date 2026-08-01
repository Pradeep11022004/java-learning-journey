
public class FindMaximum {

    static int findMaximum(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }

    }

    public static void main(String[] args) {
        int result = findMaximum(15, 25);
        System.out.println("Largest Number = " + result);
    }
}
