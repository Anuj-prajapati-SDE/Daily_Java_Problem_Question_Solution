public class Two_pointer_Reverse_Array{
    public static void main(String[] args){
        int [] arr = {1, 2, 3,4,5};
        int left = 0;                 
        int right = arr.length - 1; 
        int arrValSave = 0;
        while (left < right) {
            arrValSave  = arr[left];
            arr[left] =  arr[right];
            arr[right] = arrValSave;
            left++;
            right--;
        }
        System.out.print(java.util.Arrays.toString(arr));
       
    }
}