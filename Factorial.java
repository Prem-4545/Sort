import java.io.*;
public class Factorial
{
    public static void main(String args[]) throws IOException{
        int n,f,i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Any Number");
        n=Integer.parseInt(br.readLine());
        i=n;
        f=1;
        while(i>0){
            f=f*i;
            i--;
        }
        System.out.println("Factorial of "+n +" is "+f);
    }
}