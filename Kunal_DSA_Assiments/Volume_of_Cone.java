import java.util.Scanner;
public class Volume_of_Cone{
    public static void main (String[] args){
        System.out.println("Enter the radius of your cone:" );
        Scanner sc = new Scanner(System.in); 
           float radius  = sc.nextFloat();
        System.out.println("Enter the height of the cone:" ); 
           float h  = sc.nextFloat();
           double volume =1/3f * Math.PI * radius * radius *h;
         System.out.println("Area of Cicle is :" + String.format("%.2f", volume));          
    }
}