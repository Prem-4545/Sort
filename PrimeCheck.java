import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class PrimeCheck {
    public static void main(String[] args) throws IOException {
        int a=0,b=1,c=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        a = Integer.parseInt(br.readLine());
        while(b<=a){
            if(a%b==0)
            {
                c=c+1;
            }
            b++;
        }
        if(c==2){
            System.out.println("Prime Number "+a);
        }else{
            System.out.println("Not a Prime Number "+a);
        }
        }
    }