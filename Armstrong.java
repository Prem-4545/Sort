import java.io.*;

/**
 * Armstrong Number Checker
 * 
 * An Armstrong number (also known as narcissistic number) is a number that
 * is equal to the sum of its own digits each raised to the power of the 
 * number of digits. For example: 153 = 1^3 + 5^3 + 3^3
 * 
 * @author Prem-4545
 * @version 1.0
 */
public class Armstrong
{
    public static void main(String[] args) throws Exception
    {
        int n, t = 0, s = 0, r = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter A Number:");
        n = Integer.parseInt(br.readLine());
        t = n;
        while(n > 0)
        {
            r = n % 10;
            s = s + (r * r * r);
            n = n / 10;
        }
        if(t == s)
            System.out.println(t + " is Armstrong ");
        else
            System.out.println(t + " Not an Armstrong Number");
    }
}
