package java8;

public class Assignment4 {

	public static void main(String[] args) {
		int[] numbers= new int[] {10,90,-40,-50,90};
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		sum = sum + numbers[i];
		double average = sum / numbers.length;
		System.out.println("Average value of the array elements is : " + average);

	}

}