import java.io.*;
import java.lang.*;

/**
 * Sort Class - Compares two strings and outputs characters with maximum frequency
 * 
 * This program reads two strings from the user and for each ASCII character,
 * counts occurrences in both strings. It then prints the character as many times
 * as it appears in the string with higher frequency.
 * 
 * @author Prem-4545
 * @version 1.0
 */
public class Sort
{
    /**
     * Main method - Entry point of the program
     * Compares character frequencies in two input strings
     * 
     * @param args Command line arguments (not used)
     * @throws IOException if input reading fails
     */
    public static void main(String args[]) throws IOException
    {
        // Create BufferedReader for efficient input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Get first string input from user
        System.out.println("Enter First String:");
        String first = br.readLine();
        
        // Get second string input from user
        System.out.println("Enter Second String:");
        String second = br.readLine();
        
        // Store lengths of both strings
        int l1 = first.length();
        int l2 = second.length();
        
        // Variables to store character counts
        int count1 = 0;
        int count2 = 0;
        
        // Iterate through all ASCII characters (0-127)
        for(int c = 0; c < 128; c++){
            count1 = 0;  // Reset count for first string
            count2 = 0;  // Reset count for second string
            
            // Count occurrences of current character in first string
            for(int i = 0; i < l1; i++){
                if(first.charAt(i) == (char)c){
                    count1++;
                }
            }
            
            // Count occurrences of current character in second string
            for(int i = 0; i < l2; i++){
                if(second.charAt(i) == (char)c){
                    count2++;
                }
            }
            
            // Print character based on maximum frequency
            if(count1 > count2){
                // If more frequent in first string, print count1 times
                for(int i = 0; i < count1; i++){
                    System.out.print((char)c);
                }
            }else{
                // If more frequent in second string, print count2 times
                for(int i = 0; i < count2; i++){
                    System.out.print((char)c);
                }
            }
        }
    }
}