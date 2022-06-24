package advjava;

public class AverageValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers= new int[] {10,90,-40,-50,90};
		int sum=0;
		for(int i=0;i<numbers.length;i++)
		sum = sum + numbers[i];
		double average = sum / numbers.length;
		System.out.println("Average value of the array elements is : " + average);

	}

}
