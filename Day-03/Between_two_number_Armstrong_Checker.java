import java.util.Scanner;
public class Between_two_number_Armstrong_Checker{
   public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
          int  firstValue =  sc.nextInt();
          int  secondValue =  sc.nextInt();
         Armstrong_checker(firstValue, secondValue);
    }

    static int  Armstrong_checker(int firstValue, int secondValue){
              for(int i = firstValue; i <= secondValue; i++){
                  int armstrong =   CheckNum_Armstrong(i);
                  if(armstrong == 1){
                 System.out.println("Your given  two number between armstrong numners are : " + i);
                  };
              }
              return 0; 
    }
    static int  CheckNum_Armstrong(int num){
              int[] arr = new int[0];
              int Num = num;
              int i = 0 ;
              int sum = 0;
              int power = CountDigit(num);
              while(num > 0) {
            int digit = num % 10;
            sum  = sum + Multiple(digit, power);
            num = num / 10;
        }
         if(sum == Num) {
             return 1;
         }
         else{
            return 0 ;
         }
    }
     static int Multiple(int digit, int power) {
        int result = 1;
        for(int i = 0; i < power; i++) {
            result = result * digit;
        }
        return result;
    }  
     static int CountDigit(int num) {
        int count = 0;
        while(num > 0) {
            num = num / 10;
            count++;
        }
          return count; 
}
}