package Basics1;
import java.util.Arrays;

public class SortingString {
	public static void main(String []args) {
		String[] stringArray = new String[] {"a","g","d","c","b","f"};
		Arrays.sort(stringArray);
		System.out.println("Alphabetical order is : ");
		for(int i=0;i<stringArray.length;i++) {
			System.out.println(stringArray[i]);
		}
		
	}

}
