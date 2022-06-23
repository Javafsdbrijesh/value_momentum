import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assignment11 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		 File file = new File("/home/techvidvan/file.txt");
		    FileReader fileReader = new FileReader(file);
		    System.out.println("Successful");
try
{
	int n=10/0;
	
}
catch(ArithmeticException e)
{
	System.out.println(e);
}

	}

}
