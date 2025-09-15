import java.util.Scanner;
public class Fibonacci_Series {
public static void main(String[] args) {
    int a= 0;
    int b = 1; 
    Scanner readElement = new Scanner(System.in);
    int  inputElement  = readElement.nextInt();
    System.out.print(a + " " + b);
    for(int i=2; i<inputElement; i++){
        int c = a + b;
        System.out.print(" " + c);
        a = b;
        b = c;
    }
}
}