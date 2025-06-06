package Number_Utilities; 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a new Scanner object to read input from the console
        Scanner stdin = new Scanner(System.in);

        // Prompt user for a number
        System.out.print("Enter a number: ");
        double num = stdin.nextDouble();

        // Enter the exponent
        System.out.print("Enter the exponent to raise the number to: ");
        int exponent = stdin.nextInt();

        // Close the scanner to prevent resource leaks
        stdin.close();

        // Create a new instance of the class
        NumberUtils number = new NumberUtils(num);

        // Get some exponential value
        double newNum = number.getPower(exponent);

        // Print the result
        System.out.printf("The number %.2f raised to the power of %d is: %.2f\n", number.getNum(), exponent, newNum);
    }
}