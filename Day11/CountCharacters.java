
public class CountCharacters {

    public static void main(String[] args) {

        String text = "Java123!";
        int lettersCount = 0;
        int digitsCount = 0;
        int specialCharCount = 0;

        for (int i = 0; i < text.length() ; i++) {

            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                lettersCount++;

            } else if (Character.isDigit(ch)) {
                digitsCount++;

            } else {
                specialCharCount++;
            }

        }
        System.out.println("Letters : " + lettersCount);
        System.out.println("Digits : " + digitsCount);
        System.out.println("Special Characters : " + specialCharCount);

    }
}
