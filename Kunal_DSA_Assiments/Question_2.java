import java.util.Scanner;
public class Question_2{
    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int positiveOdd = 0;
        int positiveEven = 0;
        int negativeSum = 0;

        while(true){
         int  num = sc.nextInt();
         if(num == 0){
            break;
         }
          if(num<0){
             negativeSum = negativeSum  + num;
          }
          if(num % 2 == 0){
             positiveEven = positiveEven + num;
          }
         if(num % 2 != 0 ){
            positiveOdd = positiveOdd + num;
         }
        }
        System.out.println(positiveOdd);
        System.out.println(negativeSum);
        System.out.println(positiveEven);
    }
}