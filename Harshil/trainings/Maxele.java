package trainings;



	import java.util.*;
	public class Maxele {
		void Largest() {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter number of elements");
			int n=sc.nextInt();
			int[] arr = new int[n];
			for(int i=0;i<n;i++) {arr[i]=sc.nextInt();}
			int max=arr[0];
			for (int i = 1; i < arr.length; i++)
			{if (arr[i] > max)max = arr[i];}
			System.out.println("Max element\n"+ max);}
		public static void main(String args[]) {Maxele m=new Maxele();
		m.Largest();
		}
		}




