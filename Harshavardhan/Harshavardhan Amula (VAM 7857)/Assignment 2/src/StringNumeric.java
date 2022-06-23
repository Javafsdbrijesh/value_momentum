import java.util.Arrays;
public class StringNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test=new int[]{12,10,4,8,6,2};
		String[] stringArray = {"a","g","d","c","b","f"};
		
		Arrays.sort(test);
		Arrays.sort(stringArray);
		System.out.println(Arrays.toString(test));
		System.out.println(Arrays.toString(stringArray));

	}

}
