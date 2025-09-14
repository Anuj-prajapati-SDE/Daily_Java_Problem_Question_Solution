import java.util.Scanner;
public class Sum_of_Dight {
    public static void main(String[] args) {
          Scanner readElement = new Scanner(System.in);
        int  inputElement  = readElement.nextInt();
        int dightSum = 0;
         while (inputElement >0) {
            dightSum   = dightSum + inputElement % 10;
             inputElement = inputElement/10;

         }
         System.out.println("Sum of  dight is : "  + dightSum);

    }
}
