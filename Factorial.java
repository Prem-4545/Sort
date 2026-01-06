import java.io.*;

/**
 * Factorial Calculator
 * 
 * Factorial of a number n (denoted as n!) is the product of all positive integers
 * less than or equal to n. For example: 5! = 5 * 4 * 3 * 2 * 1 = 120
 * 
 * This program calculates the factorial of a user-provided number.
 * 
 * @author Prem-4545
 * @version 1.0
 */
public class Factorial
{
    /**
     * Main method - Entry point to calculate factorial
     * 
     * @param args Command line arguments (not used)
     * @throws IOException if input reading fails
     */
    public static void main(String args[]) throws IOException{
        int n, f, i;  // n = input, f = factorial result, i = counter
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Get number input from user
        System.out.println("Enter Any Number");
        n = Integer.parseInt(br.readLine());
        
        // Initialize counter and factorial result
        i = n;
        f = 1;
        
        // Multiply all numbers from n down to 1
        while(i > 0){
            f = f * i;  // Multiply current value with result
            i--;        // Decrement counter
        }
        
        // Display the factorial result
        System.out.println("Factorial of " + n + " is " + f);
    }
}
