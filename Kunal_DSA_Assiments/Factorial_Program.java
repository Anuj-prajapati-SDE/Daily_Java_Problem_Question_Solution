import java.util.Scanner;
public  class Factorial_Program{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input  =  sc.nextInt();
        int fact = 1;
        for( int i = input; i>0 ; i--){
              fact =  fact *i; 
        }
        System.out.print("Factorial is :" + fact);
    }
}    
