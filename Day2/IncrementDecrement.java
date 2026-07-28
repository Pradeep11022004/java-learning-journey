public class IncrementDecrement {

    public static void main(String[] args) {

        int number = 10;

        System.out.println("========== Increment & Decrement ==========");

        System.out.println("Original Value : " + number);

        System.out.println("Pre Increment  : " + (++number));
        System.out.println("Post Increment : " + (number++));
        System.out.println("Current Value  : " + number);

        System.out.println("Pre Decrement  : " + (--number));
        System.out.println("Post Decrement : " + (number--));
        System.out.println("Final Value    : " + number);

        System.out.println("===========================================");
    }
}