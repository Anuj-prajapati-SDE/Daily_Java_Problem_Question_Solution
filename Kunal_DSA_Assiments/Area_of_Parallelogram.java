import java.util.Scanner;
public class Area_of_Parallelogram{
    public static void main (String[] args){
        System.out.println("Enter the  base:" );
        Scanner sc = new Scanner(System.in); 
         float b  = sc.nextFloat();
            System.out.println("Enter the height:" );
           float  h  = sc.nextFloat();
           double Area =  b * h;
         System.out.println("Area of Parallelogram is :" + String.format("%.2f", Area));          

    }}