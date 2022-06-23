import java.util.Arrays;
public class assingment2 {
	public static void main(String[] args) {
		int sortnum[] = {1,3,2,6,5};
		String sortstring[]={"a","g","d","c","b","f"};
		Arrays.sort(sortnum);
		Arrays.sort(sortstring);
		System.out.print("sorted numbers: "+Arrays.toString(sortnum));
		System.out.println(" ");
		System.out.print("sorted String: "+Arrays.toString(sortstring));
	}

}
