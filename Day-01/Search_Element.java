import java.util.Scanner;
public class Search_Element {
    public static void main(String[] args) {
        int nigation = 0 ;
        int [] arr  =  {20, 33, 24, 35, 45 , 47};
        Scanner readElement = new Scanner(System.in);
        int  inputElement  = readElement.nextInt();
         for(int i =0 ; i< arr.length; i++){
             if (inputElement == arr[i]) {
                System.out.println("Enter element is present in the array "); 
                 nigation = 1;
                break;
             }
           
         }
         if (nigation == 0) {           
             System.out.println("Enter element is  not present in the array "); 
         }

    }
}
