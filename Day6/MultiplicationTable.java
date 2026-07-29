
import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {

        System.out.println("===== Multiplication Table =====");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();

        System.out.println();

        for(int i=1;i<=10;i++){

            System.out.println(num+" x "+i+" = "+num*i);

        }
         System.out.println("===================================");

         sc.close();
        
    }
}