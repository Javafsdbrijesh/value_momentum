import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N value");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array values");
		
		int c=0;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the element");
		int num=sc.nextInt();
        int index = 0;
         
       int i=0;
        while(i < arr.length) {
            if(arr[i] == num) {
                index = i;
                break;
            }
            i++;
        }
         
        System.out.println("Index of "+num+" is : "+index);
    }
}
