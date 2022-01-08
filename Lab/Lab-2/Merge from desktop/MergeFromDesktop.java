import java.io.*;
class MergeFromDesktop {
 
    public static void main(String[] args) throws IOException
    {
        File dir = new File("C:\\Users\\ASUS\\Desktop");
        PrintWriter pw = new PrintWriter("output.txt");
        String[] fileNames = dir.list();
        for (String fileName : fileNames) {
            pw.println(fileName);
            pw.flush();
        }
        System.out.println("Reading from all files"+" in directory " + dir.getName() + " Completed");
    }
}
