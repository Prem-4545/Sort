import java.io.*;
public class PrimeCount
{
    public static void main(String args[]) throws Exception
    {
        int a=1,r;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number: ");
        r=Integer.parseInt(br.readLine());
        while(a<=r)
        {
            int b=1,c=0;
            while(b<=a)
            {
                if(a%b==0)
                    c=c+1;
                    b++;
                }
            if(c==2)
                System.out.println("PrimeCount is: "+a);
            a++;
            }
            
        }

}