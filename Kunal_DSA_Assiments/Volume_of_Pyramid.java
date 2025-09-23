import java.util.Scanner;
public class Volume_of_Pyramid{
    public static void main (String[] args){
        System.out.println("Enter the base_area:" );
        Scanner sc = new Scanner(System.in); 
           float radius  = sc.nextFloat();
        System.out.println("Enter the height :" ); 
           float h  = sc.nextFloat();
           double volume =1/3f  *base_area*h;
         System.out.println("Volume_of_Pyramid :" + String.format("%.2f", volume));          
    }
}