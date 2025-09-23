import java.util.Scanner;
public class Area_of_Equilateral_Triangle{
    public static void main (String[] args){
           System.out.println("Enter the value  of  a:" );
        Scanner sc = new Scanner(System.in); 
           float a  = sc.nextFloat();
          double constant = Math.sqrt(3) / 4;
           double Area = constant*a*a;
         System.out.println("Area of Equilateral Triangle is :" + String.format("%.2f", Area));          
    }
}