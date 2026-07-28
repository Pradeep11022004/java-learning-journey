public class SwapNumbers {

    public static void main(String[] args) {

        int firstNumber = 10;
        int secondNumber = 20;
        int temp;

        System.out.println("========== Swap Numbers ==========");

        System.out.println("Before Swapping");
        System.out.println("First Number  : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);

        temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println();
        System.out.println("After Swapping");
        System.out.println("First Number  : " + firstNumber);
        System.out.println("Second Number : " + secondNumber);

        System.out.println("==================================");
    }
}