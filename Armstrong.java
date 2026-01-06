import java.io.*;

public class Armstrong
{
    public static void main(String[] args) throws Exception
    {
        int n,t=0,s=0,r=0;
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter A Number:");
        n=Integer.parseInt(br.readLine());
        t=n;
        while(n>0)
        {
            r=n%10;
            s=s+(r*r*r);
            n=n/10;
        }
        if(t==s)
        System.out.println(t+" is Armstrong ");
        else
        System.out.println(t+" Not an Armstrong Number");
    }
}