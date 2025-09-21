import java.util.Scanner;
public class Leap_Year_Checker{
      public static  void  main(String args[]){
           Scanner scanner = new Scanner(System.in);
    System.out.print("Enter any  Year: ");
        int year= scanner.nextInt();
        if(year % 4  ==0 ){
           System.out.print("Enter Year is leap year ");
        }
        else{
          System.out.println("enter Year is not a leap year");
        }
    }
}