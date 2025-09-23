import java.util.Scanner;
public class Perimeter_of_Parallelogram{
    public static void main (String[] args){
        System.out.println("Enter the value of a :" );
        Scanner sc = new Scanner(System.in); 
           float a  = sc.nextFloat();
        System.out.println("Enter the  value of b:" );
           float b  = sc.nextFloat();
           float Perimeter = 2 * (a+b);
         System.out.println("Area of Cicle is :" + String.format("%.2f", Perimeter));          
    }
}