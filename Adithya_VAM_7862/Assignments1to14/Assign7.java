package jun1517;
//Assignment 7: Write a Java program to remove a specific element from an array.
public class Assign7 {
	public static void main(String []args) {
		int or[]= {4,5,6,7,8,9};
		int dp[]=new int[or.length-1];
		int z=1;//taking index value
		for(int i=0,k=0;i<or.length;i++) {
			if(i==z) {
				continue;
			}
			dp[k++]=or[i];
		}
		for(int f=0;f<dp.length;f++) {
			System.out.println(dp[f]);
		}
		//dp=removeTheElement(or,2);
	}
}
