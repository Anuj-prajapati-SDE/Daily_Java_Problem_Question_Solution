import java.util.Scanner;
public class CGPA_maker {
    public static void main(String args[]){
        int  numCount = 0;
         int Subsum = 0;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the grades:");
          while(true){
          int  num = sc.nextInt();
              Subsum = Subsum +num;
             numCount++;
             if(num>10){
              System.out.println("Enter correct Grades"); 
              Subsum = Subsum - num;
              numCount--;
             }
             if(num == 0){
                numCount--;
                 break;  }
          }
           float cgpa =  Subsum/numCount;
        System.out.println(cgpa);
    }
}