
import java.util.Scanner;

public class SumOfNaturalNumbers{
    public static void main(String[] args) {
        
        System.out.println("===== Sum Of Natural Numbers =====");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt(); 
        int sum =0;
        for (int i =1;i<=n;i++){
            sum += i;

        }  System.out.println("Sum of Natural Number "+n+" is : " + sum);

          System.out.println("===================================");

          sc.close();
    }
}