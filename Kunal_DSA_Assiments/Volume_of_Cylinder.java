import java.util.Scanner;
public class Volume_of_Cylinder{
    public static void main (String[] args){
        System.out.println("Enter the radius :" );
        Scanner sc = new Scanner(System.in); 
           float radius  = sc.nextFloat();
        System.out.println("Enter the height" ); 
           float h  = sc.nextFloat();
           double volume =  Math.PI * radius * radius *h;
         System.out.println("Volume_of_Cylinder is :" + String.format("%.2f", volume));          
    }
}