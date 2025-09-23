import java.util.Scanner;
public class Perimeter_of_Equilateral_Triangle{
    public static void main (String[] args){
        System.out.println("Enter the length of one side of the equilateral triangle " );
        Scanner sc = new Scanner(System.in); 
           float a  = sc.nextFloat();
            float Area = 3 *a;
         System.out.println("Perimeter of Equilateral Triangle:" + String.format("%.2f", Area));          
    }
}