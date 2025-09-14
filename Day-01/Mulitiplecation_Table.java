import java.util.Scanner;
public class Mulitiplecation_Table {
    public static void main(String[] args) {
          Scanner readElement = new Scanner(System.in);
        int  tableNumber  = readElement.nextInt();
        int  multipleResult =  0 ;
         for(int i = 1; i<=10 ; i++){
              multipleResult =  tableNumber * i;
             System.out.println(tableNumber +"*"+ i +"=" + multipleResult);
         }
    }
}
