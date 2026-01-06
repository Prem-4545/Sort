import java.util.*;
import java.io.*;
import java.lang.*;
public class Sort
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter First String:");
        String first=br.readLine();
        System.out.println("Enter Second String:");
        String second=br.readLine();
        int l1=first.length();
        int l2=second.length();
        int count1=0;
        int count2=0;
        for(int c=0;c<128;c++){
            count1 = 0;
            count2 = 0;
            for(int i=0;i<l1;i++){
                if(first.charAt(i) == (char)c){
                    count1++;
                }
            }
            for(int i=0;i<l2;i++){
                if(second.charAt(i) == (char)c){
                    count2++;
                }
            }
            if(count1>count2){
                for(int i=0;i<count1;i++){
                    System.out.print((char)c);
                }
            }else{
                for(int i=0;i<count2;i++){
                    System.out.print((char)c);
                }
            }
        }
    }
}