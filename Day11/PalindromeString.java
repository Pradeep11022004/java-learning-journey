
import java.util.Scanner;

public class PalindromeString{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word : ");
        String text =sc.nextLine();

        String revString ="";

        for(int i=text.length()-1;i>=0;i--){
            revString +=text.charAt(i);
        }
        if(text.equals(revString)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

        sc.close();


    }
}