import java.util.Arrays;

public class assingment9 {

	public static void main(String[] args) {
		int arrayinsert[]= {2,1,3,10,30,20,11,4};
		int index=3;
		int newval=9;
		System.out.println("intial array: "+Arrays.toString(arrayinsert));
		for(int i=arrayinsert.length-1;i>index;i--)
		{
			arrayinsert[i]=arrayinsert[i-1];	
		}
		arrayinsert[index]=newval;
		System.out.println("new array: "+Arrays.toString(arrayinsert));

	}

}
