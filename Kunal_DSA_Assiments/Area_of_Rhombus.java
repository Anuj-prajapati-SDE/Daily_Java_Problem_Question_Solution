import java.util.Scanner;
public class Area_of_Rhombus{
    public static void main (String[] args){
           System.out.println("Enter the  first length diagonal:" );
        Scanner sc = new Scanner(System.in); 
           float d1  = sc.nextFloat();
            System.out.println("Enter the  second length diagonal:" );
           float  d2  = sc.nextFloat();
           double Area = 0.5 * d1 * d2;
         System.out.println("Area of Rhombuas is :" + String.format("%.2f", Area));          
    }
}