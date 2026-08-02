public class SearchElement {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        boolean isFound = false;
        int foundIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                isFound = true;
                foundIndex = i;
                break;
            }
        }

        if (isFound) {
            System.out.println("Element Found at index " + foundIndex + ".");
        } else {
            System.out.println("Element Not Found.");
        }
    }
}