public class LargestElement{
    public static void main(String[] args) {
        int[] numbers ={12,45,7,89,32};

        int largestNumber = numbers[0];

        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]>largestNumber){
               largestNumber=numbers[i];
            }
            
        }System.out.println("Largest Element : "+largestNumber);
    }
}