package jun1517;
//Assignment 6: Write a Java program to find the index of an array element.
public class Assign6 {
	public static void main(String[]args) {
		int []a= {1,4,6,8,14,58};
		int f=6;
		for(int i=0;i<a.length;i++) {
			if(a[i]==f) {
				System.out.println("your number is in "+(i+1)+"rd place");
			}
		}
	}
}