import java.util.Scanner;
public class Currenncy_covert_INR_TO_USD{
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);
             float  currency =  sc.nextFloat();
             System.out.print(" In the us dollar : " + Currenncy_covert(currency) +"$");  
    }

    static float Currenncy_covert(float money){
             float div  = money / 88.19f;
              return div;
    }
}