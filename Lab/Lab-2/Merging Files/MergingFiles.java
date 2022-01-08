import java.io.*;
  
public class MergingFiles 
{
    public static void main(String[] args) throws IOException 
    {
        PrintWriter pw = new PrintWriter("file3.txt");
        BufferedReader bwriter1 = new BufferedReader(new FileReader("file1.txt"));
        BufferedReader bwriter2 = new BufferedReader(new FileReader("file2.txt")); 
        String line1 = bwriter1.readLine();
        String line2 = bwriter2.readLine();
        while (line1 != null || line2 !=null)
        {
            if(line1 != null)
            {
                pw.println(line1);
                line1 = bwriter1.readLine();
            }
              
            if(line2 != null)
            {
                pw.println(line2);
                line2 = bwriter2.readLine();
            }
        }
        pw.flush();
        bwriter1.close();
        bwriter2.close();
        pw.close();  
        System.out.println("Merged into file3.txt");
    }
}