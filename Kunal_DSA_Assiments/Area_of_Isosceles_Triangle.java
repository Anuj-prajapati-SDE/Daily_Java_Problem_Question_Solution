import java.util.Scanner;
public class Area_of_Isosceles_Triangle{
    public static void main (String[] args){
         System.out.println("Enter the base the value Triangle:" );
           Scanner sc = new Scanner(System.in); 
          float b  = sc.nextFloat();
          float base = b/4;
          System.out.println("Enter the base the value Triangle:" );
          float a  = sc.nextFloat();
          float  solve = 4*a*a - b*b;
          double Area =  base * Math.pow( solve , 0.5);
          System.out.println(String.format("%.2f", Area ));
    }}