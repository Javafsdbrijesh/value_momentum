package jun1517;
//Write a Java program to calculate the average value of array elements
public class Sumavg {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int f[]= {5,22,34,1,9,0,45};
		for(int i=0;i<f.length;i++) {
			sum+=f[i];
		}
		System.out.println(sum/(f.length));
	}

}
