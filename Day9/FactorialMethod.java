
public class FactorialMethod {

    static int factorial(int num) {
        if(num<0){
            return -1;
        }
        int fact = 1;
        
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {

        int result = factorial(5);
        System.out.println("Factorial = " + result);
        

    }
}
