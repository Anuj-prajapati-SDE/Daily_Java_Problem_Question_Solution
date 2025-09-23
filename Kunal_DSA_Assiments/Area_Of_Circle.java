import java.util.Scanner;
//area of circle formula   A = π*r*r
public class Area_Of_Circle{
    public static void main (String[] args){
        System.out.println("Enter the radius of your circle:" );
        Scanner sc = new Scanner(System.in); 
           float radius  = sc.nextFloat();
           double Area = Math.PI * radius * radius;
         System.out.println("Area of Cicle is :" + String.format("%.2f", Area));          
    }
}