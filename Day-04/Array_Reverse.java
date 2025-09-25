import java.util.Arrays;
public class Array_Reverse{
public static void main(String[] args){
    int arrValSave = 0;
    int count = 0;
     int [] arr = {1, 2, 3,4,5};
         for(int i = arr.length-1; i>1; i--){
                arrValSave  = arr[count];
                arr[count] =  arr[i];
                arr[i] = arrValSave;
                count++;   
         }
          System.out.print(Arrays.toString(arr));

    }
}  