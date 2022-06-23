// Assignment 11: CheckedException

package Assignments;

import java.io.*;

public class CheckExcep {

	public static void main(String[] args) {
		FileReader f = new FileReader("C:/myfile.txt");
		BufferedReader fileInput = new BufferedReader(f);
		for(int i = 0; i < 3; i++)
			System.out.println(fileInput.readLine());
		fileInput.close();
	}

}
