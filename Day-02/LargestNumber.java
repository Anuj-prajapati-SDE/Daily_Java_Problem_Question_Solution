import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for first number
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        // Prompt user for second number
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Find and print the largest number
        if (num1 > num2) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("Both numbers are equal: " + num1);
        }
        
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}