public class Main{
   public static void main(String args[]){
      
      int[]numbers = {10,2,0,5,9,9,10};
      
      bubbleSort(numbers);  
      
      for(int n : numbers){
         System.out.print(n + " ");
      }
   }
   
   private static void bubbleSort(int numbers[]){
      int temp = 0;
      
      for(int i = 0; i < numbers.length - 1; i++){
         for(int j = 0; j < numbers.length - i -1; j++){
            if(numbers[j] > numbers[j+1]){
               temp = numbers[j];
               numbers[j] = numbers[j+1];
               numbers[j+1] = temp;
            }
         }
      }
   }
}