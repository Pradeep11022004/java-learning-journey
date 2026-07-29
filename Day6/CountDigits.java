
import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        System.out.println("===== Count Digits =====");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int count =0;

        for(int i=num;i!=0; i/=10){
            count++;
        }System.out.println("Number of Digits : " + count);

        sc.close();
        System.out.println("===================================");
    }
}
