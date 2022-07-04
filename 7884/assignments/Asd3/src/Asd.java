
public class Asd {
	public static void main(String []args) {
		int[] arr2= {1,2,3,4,5,6};
		int i,sum=0,avg = 0;
		for(i=0;i<arr2.length;i++) {
			sum= sum+arr2[i];
			avg=sum/(arr2.length);
			}
		System.out.println("The Average is "+ avg);
		}
	}
