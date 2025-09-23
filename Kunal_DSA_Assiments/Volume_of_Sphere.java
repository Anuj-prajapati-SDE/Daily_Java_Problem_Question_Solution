import java.util.Scanner;
public class Volume_of_Sphere{
    public static void main (String[] args){
        System.out.println("Enter the radius:" );
        Scanner sc = new Scanner(System.in); 
           float radius  = sc.nextFloat();
           double volume =4/3f * Math.PI * radius * radius *radius;
         System.out.println("Volume_of_Sphere :" + String.format("%.2f", volume));          
    }
}