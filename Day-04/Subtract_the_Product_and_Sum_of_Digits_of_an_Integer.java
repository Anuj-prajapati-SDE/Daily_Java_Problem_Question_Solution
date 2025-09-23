import java.util.Scanner;
public class Subtract_the_Product_and_Sum_of_Digits_of_an_Integer{
    public static void main(String[] argS){
        Scanner sc = new Scanner(System.in);
            int  num = sc.nextInt();
          int  sum =   Sum_of_Digits(num);
            System.out.println("Sum_of_Digits_of_an_Integer :" + sum);
          int product = Product_of_Digits(num);
            System.out.println("Product_of_Digits_of_an_Integer :" + product);
          int subtract_of_Product_and_Sum_of_Digits  = product - sum;
          System.out.println("Subtract_the_Product_and_Sum_of_Digits_of_an_Integer :" + subtract_of_Product_and_Sum_of_Digits);
    }
    public static int Sum_of_Digits(int num){
         int sum = 0;
            while(num>0){
                int dight = num % 10;
                  sum = sum + dight;
                   num = num / 10;
            }
            return sum;
     }
    public static int Product_of_Digits(int num){
         int product = 1;
            while(num>0){
                int dight = num % 10;
                   product = product *  dight;
                    num = num / 10;
            }
            return product;
     }
}