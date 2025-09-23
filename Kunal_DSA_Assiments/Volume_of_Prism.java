import java.util.Scanner;
public class Volume_of_Prism{
    public static void main (String[] args){
        System.out.println("Enter the value of  base area:" );
        Scanner sc = new Scanner(System.in); 
           float base_area  = sc.nextFloat();
        System.out.println("Enter the height of the cone:" ); 
           float h  = sc.nextFloat();
           double volume =  h * base_area;
         System.out.println("Area of Cicle is :" + String.format("%.2f", volume));          
    }
}