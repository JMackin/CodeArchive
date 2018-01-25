import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MainTextFileBackwards
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new FileReader(new File("input.txt")));
        String text = "";
        String q = reader.readLine();
        
        while(q != null)
        {
            text += q;
            q = reader.readLine();
            
        }
        reader.close();
        char[] a = text.toCharArray();
        for(int i = a.length-1; i >= 0; i--)
        {
            System.out.print(a[i]);
        }
    }
}
