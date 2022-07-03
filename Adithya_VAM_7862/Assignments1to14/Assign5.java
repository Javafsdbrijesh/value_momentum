package jun1517;
//Assignment 5: Write a Java program to test if an array contains a specific value.
public class Assign5 {
	public static boolean x(int []f,int z) {
		for(int y:f) {
			if(z==y) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[]args) {
		int t[]= {4,3,1,0,5,7};
		System.out.println(x(t,6));
	}
}
