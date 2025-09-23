import java.util.Scanner;

public class Perimeter_of_Circle{
    public static void main (String[] args){
        System.out.println("Enter the radius of your circle:" );
        Scanner sc = new Scanner(System.in); 
           float radius  = sc.nextFloat();
           double Area = 2 * Math.PI * radius ;
         System.out.println("Perimeter of Circle :" + String.format("%.2f", Area));          
    }
}