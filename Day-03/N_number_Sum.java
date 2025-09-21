import java.util.Scanner;
public class N_number_Sum {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Sum();
        
    }
    static void Sum() { 
         Scanner sc = new Scanner(System.in);
        int numSum = 0;       
        while(true){ 
              String cha = sc.next();
              if(cha.equals("x")) {
               System.out.print(numSum);
               break;
              }
             int num =  Integer.parseInt(cha);
             numSum = numSum +num;
          };  
    }
}