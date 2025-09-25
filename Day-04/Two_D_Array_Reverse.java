import  java.util.Arrays;
public  class Two_D_Array_Reverse{

    public static void main(String[] args){
      int  count1 = 0;
      int count2 = 0;
      int   saveVal = 0;
     int [][] arr = {{1,2}, {4,5}};
         for(int i = arr.length-1;  i>=0; i--){
            for( int j = arr[i].length-1; j>=0; j--){
                       saveVal = arr[count1][count2]; 
                        arr[count1][count2] = arr[i][j];
                        arr[i][j] =  saveVal;
                       count2++;              
                   }     
                        count1++; 
         }

        System.out.print(count1);
        System.out.print(count2);
         
        System.out.print(Arrays.deepToString(arr));
    }
}