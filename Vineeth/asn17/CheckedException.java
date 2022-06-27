package assgn10;

import java.io.BufferedReader;

public class CheckedException {

	public static void main(String[] args) {
		FileReader f = new FileReader("C:/myfile.txt");
		BufferedReader fileInput = new BufferedReader(f);
		for(int i = 0; i < 3; i++)
			System.out.println(fileInput.readLine());
		fileInput.close();
		

	}

}
