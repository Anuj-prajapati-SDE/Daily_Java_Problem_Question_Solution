import java.util.Scanner;
public class N_Number_Input_Find_Largest_Number{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int largestNum = 0;
       while(true){
        int input = sc.nextInt();
          if(input == 0){
              break;
          }
           if(input > largestNum){
                largestNum = input; 
            }
          }
        System.out.print("Largest value is :" + largestNum);
    }
   
}