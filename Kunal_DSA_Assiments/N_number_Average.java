import java.util.Scanner;
public  class N_number_Average {
    public static void main(String[] args){
         int  numCount = 0;
         int sum = 0;
          Scanner sc = new Scanner(System.in);
          while(true){
          int  num = sc.nextInt();
              sum = sum +num;
             numCount++;
             if(num == 0){
                numCount--;
                 break;  }
          }
           float average =  sum/numCount;
        System.out.println(average);
    }
}