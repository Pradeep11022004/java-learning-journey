
public class ReverseString{
    public static void main(String[] args) {
        
        // String text ="Hello";

        // String revsString = new StringBuilder(text).reverse().toString();  // built in methods.

        // System.out.println(revsString);

        String text ="Hello";

        String revsString ="";

        for(int i=text.length()-1;i>=0;i--){

            revsString +=text.charAt(i);
           
        }System.out.println(revsString);

        
    }
}