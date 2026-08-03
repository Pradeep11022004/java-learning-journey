
public class CountWords {

    public static void main(String[] args) {

        String text = "Hello java Welcome";

        int wordCount = 1;

        for (int i = 0; i <= text.length() - 1; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        System.out.println("Word Count : " + wordCount);

    }
}
