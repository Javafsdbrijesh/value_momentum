//Assignment 12: Practice one example of each...Checked Exception, Unchecked Exception, Error.

import java.io.*;
public class CheckedException {
	public static void main(String []args) 
		throws IOException
		{
			FileReader file = new FileReader("C:\\Users\\AbhiramChowdaryMasin\\Downloads\\myfile.txt ");
			BufferedReader fileInput = new BufferedReader(file);
			for (int counter = 0; counter <3; counter++)
				System.out.println(fileInput.readLine());
			fileInput.close();
		}
}

