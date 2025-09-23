import java.util.Scanner;
public class Area_Of_Triangle{
    public static void main (String[] args){
           System.out.println("Enter the width of your Triangle:" );
        Scanner sc = new Scanner(System.in); 
           float b  = sc.nextFloat();
            System.out.println("Enter the height of your Tringle:" );
           float  h  = sc.nextFloat();
           double Area = 0.5 * b * h;
         System.out.println("Area of Triangle is :" + String.format("%.2f", Area));          
    }
}