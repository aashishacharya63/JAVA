import java.io.IOException;
public class ThrowsExample {
    public void getFile(String file) throws IOException
	{
		throw new IOException("File not found in your current directory");
	} 
    public static void main(String[] args) throws IOException
	{
		ThrowsExample throwsExe = new ThrowsExample();
        try {
            throwsExe.getFile("java-tutorial.pdf"); 
        } catch (Exception e) {
            System.out.println("Error message:"+ e.getMessage());
        }
			
	}   
}
