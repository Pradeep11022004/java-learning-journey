
public class CountVowels {

    public static void main(String[] args) {

        String text = "Programming";
        int countVowel = 0;

       

        for (int i = 0; i <= text.length() - 1; i++) {

            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u'
                    || text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'I' || text.charAt(i) == 'O' || text.charAt(i) == 'U') {
                countVowel++;
            }

        }
        System.out.println("Vowels = " + countVowel);

    }
}
