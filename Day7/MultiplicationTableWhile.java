
import java.util.Scanner;

public class MultiplicationTableWhile{
    public static void main(String[] args) {
        System.out.println("===== Multiplication Table While Loop using =====");

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

    
        System.out.println();

        int i = 0;

        while(i<=10){
            System.out.println(num +" x "+ i +" = "+ num*i);
            i++;
        }
          System.out.println("===================================");

         sc.close();
    }
}