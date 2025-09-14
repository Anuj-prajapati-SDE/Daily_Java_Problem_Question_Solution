public class Count_Even_Odd_In_Array {

    public static void main(String[] args) {
        int evenCounter = 0;
        int oddCounter  = 0;
        int [] arr = {10, 23, 2, 33, 44, 54};
          for(int i = 0 ;  i< arr.length; i++){
            if(arr[i]%2 == 0){
                 evenCounter++;
            }
            else{
                oddCounter++;

            }
        
          }
          System.out.println("Even count in the array :" +evenCounter);
          System.out.println("odd count in the array :" + oddCounter);
    }
}