public class Gusse_Number_positive_negative_in_Array {
     public static void main(String[] args) {
        int positiveCounter = 0;
        int negativeCounter = 0;
        int ZeroCounter = 0;
        int [] arr  ={ 12 , 45 , 0, 0, -45,34, -22};

        for( int i = 0 ;  i<arr.length ; i++){
            if (arr[i]> 0){
                positiveCounter++;
                
            }
            if (arr[i]< 0){
                negativeCounter++;
               
            }
            if (arr[i]== 0 ) {
                ZeroCounter++;
            }
        }
         System.out.println("Number of positive dight :" + positiveCounter);
         System.out.println("Number of negative dight :" + negativeCounter);
         System.out.println("Number of  Zero dight :" + ZeroCounter);
     }
}
