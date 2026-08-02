public class SmallestElement{
    public static void main(String[] args) {
        int[] numbers ={12,45,7,89,32};

        int smallestNumber = numbers[0];

        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]<smallestNumber){
               smallestNumber=numbers[i];
            }
            
        }System.out.println("Smallest Element : "+smallestNumber);
    }
}