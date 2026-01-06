import java.io.FileWriter;
import java.io.IOException;

public class Unicodealls
{
    public static void main(String args[]) throws IOException
    {
        FileWriter fw = new FileWriter("unicode.txt");
        for(int i=32;i<=65535;i++)
        {
            fw.write(i+" : " + (char) i +"\n");
        }
        fw.close();
        System.out.println("Done Check unicode.txt file");
    }
}