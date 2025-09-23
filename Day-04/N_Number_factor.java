import java.util.Scanner;
public class N_Number_factor{
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        int  num = sc.nextInt();
       findFactor(num);
    }
    static void findFactor(int num){

          for (int i=1; i<= num ; i++){
               if(num % i == 0){
               System.out.print(i + " ");
               }
               
          }
      
    }
    
}