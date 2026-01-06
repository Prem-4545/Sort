import java.io.*;
public class BinaryCheck
{
    public static void main(String args[]) throws NumberFormatException, IOException{
    int r,c,n,t;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter Binary Number");
    n=Integer.parseInt(br.readLine());
    t=n;
    c=r=0;
while(n>0)
{
    if(n%10==0 || n%10==1)
        c++;
    r++;
    n=n/10;
}
if(c==r){
    System.out.println("It is a Binary Number");
        }else{
            System.out.println("It is not a Binary Number");
        }
    }
}