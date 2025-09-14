public class Find_Maximum_Element {
    public static void main(String[] args) {
         int max = 0;
            int[] arr = {1, 25, 35, 4, 5};
    
         for(int i = 0 ; i<arr.length ; i++){
             if(arr[i] > max){
                max = arr[i];
             }
         }
         System.out.println("Maximum element in the array: " + max);
    }
}