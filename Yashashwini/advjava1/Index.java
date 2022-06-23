package advjava1;

public class Index {
	public static int findIndex(int arr[], int t)
	{
	 if(arr == null)
	 {
		 return -1;
	 }
	 int len= arr.length;
	 int i=0;
	 while(i<len)
	 {
		 if(arr[i]==t)
		 {
			 return i;
		 }
		 else
		 {
			 i=i+1;
		 }
	 }
	 return -1;
	}
		public static void main(String[] args) {
			int[] array= {20,25,30,35,40,45};
			System.out.println("Index position of 25 is: " + findIndex(array,25) );

		}

}
