package specific;

public class Specific {

	public static void main(String[] args) {
		int[] a=new int[] {2,4,5,30,56,32,12};
		int toFind=55;
		boolean found = false;
		for (int b :  a) {
			if(b == toFind) {
				found = true;
				break;
				
			}
		}
		if(found)
			System.out.println(toFind +"is presented in array. ");
		else
			System.out.println(toFind +"is not presented in array");
		

	}

}
