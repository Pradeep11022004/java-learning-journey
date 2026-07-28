public class AverageOfThreeNumbers {

    public static void main(String[] args) {

        int numberOne = 10;
        int numberTwo = 20;
        int numberThree = 30;

        int total = numberOne + numberTwo + numberThree;
        double average = total / 3.0;

        System.out.println("========== Average of Three Numbers ==========");

        System.out.println("Number 1 : " + numberOne);
        System.out.println("Number 2 : " + numberTwo);
        System.out.println("Number 3 : " + numberThree);
        System.out.println("Average  : " + average);

        System.out.println("==============================================");
    }
}