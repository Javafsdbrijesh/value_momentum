import java.io.*;
public class Chheckk {
		   public static void main(String args[]) 
		   {
			FileInputStream fis = null;
		        fis = new FileInputStream("B:/myfile.txt"); 
			int k; 

			while(( k = fis.read() ) != -1) 
			{ 
				System.out.print((char)k); 
			} 

			/*The method close() closes the file input stream
			 * It throws IOException*/
			fis.close(); 	
		   }
		}

