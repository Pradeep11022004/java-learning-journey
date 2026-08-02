public class SecondLargest{
    public static void main(String[] args) {
        int[] numbers ={50,40,30,20,10};
        int firstLargest = numbers[0];

        int secondLargest =Integer.MIN_VALUE;

        for(int i =0;i<numbers.length;i++){

            if(firstLargest < numbers[i]){
                secondLargest = firstLargest;
                firstLargest=numbers[i];

            }else if(secondLargest<numbers[i] && firstLargest!=numbers[i]){
                secondLargest=numbers[i];
            }
        }System.out.println("Second Largest : "+secondLargest);




        }
}