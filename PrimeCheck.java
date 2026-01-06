import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Prime Number Checker
 * 
 * A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
 * This program checks if a given number is prime by counting its divisors.
 * If divisor count equals 2 (1 and itself), the number is prime.
 * 
 * @author Prem-4545
 * @version 1.0
 */
public class PrimeCheck {
    
    /**
     * Main method - Entry point to check if number is prime
     * 
     * @param args Command line arguments (not used)
     * @throws IOException if input reading fails
     */
    public static void main(String[] args) throws IOException {
        int a = 0, b = 1, c = 0;  // a = number, b = divisor, c = divisor count
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Get number input from user
        System.out.println("Enter a number: ");
        a = Integer.parseInt(br.readLine());
        
        // Count all divisors of the number
        while(b <= a){
            if(a % b == 0)  // If b divides a evenly
            {
                c = c + 1;  // Increment divisor count
            }
            b++;
        }
        
        // Prime number has exactly 2 divisors (1 and itself)
        if(c == 2){
            System.out.println("Prime Number " + a);
        } else {
            System.out.println("Not a Prime Number " + a);
        }
    }
}
