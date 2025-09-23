import java.util.Scanner;
public class Area_of_Rectangle{
    public static void main (String[] args){
        System.out.println("Enter the length of your Rectangle:" );
        Scanner sc = new Scanner(System.in); 
         float l  = sc.nextFloat();
            System.out.println("Enter the width of your Rectangle:" );
           float  w  = sc.nextFloat();
           double Area =  l * w;
         System.out.println("Area of Triangle is :" + String.format("%.2f", Area));          

    }}