package jun1517;

public class Sumofarray {
// Write a Java program to sum values of an array.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int f[]= {5,22,34,1,9,0,45};
		for(int i=0;i<f.length;i++) {
			sum+=f[i];
		}
		System.out.println(sum);
	}

}
