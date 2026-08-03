
public class RemoveSpaces {

    public static void main(String[] args) {
        String text = "Java Full Stack";

        String afterRemoveSpace = text.replaceAll(" ", "");

        System.out.println("Before Removing Space : " + text);
        System.out.println();
        System.out.println("After Removing Space : " + afterRemoveSpace);

    }
}
