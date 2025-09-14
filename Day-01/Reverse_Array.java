import java.util.Arrays;

public class Reverse_Array {
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50};
    int[] reverse_Array = new int[arr.length];
    int count = 0;
    for (int i = arr.length- 1; i >= 0; i--) {
        reverse_Array[count] = arr[i];
        count++;
    }

    System.out.println(Arrays.toString(reverse_Array)); 
  }
}
