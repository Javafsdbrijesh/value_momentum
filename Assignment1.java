import java.util.*;
public class Assignment1 {
	public static void main(String[] args)
	{
	int[] n = new int[5];
	int i;
	Scanner in =new Scanner(System.in);
	System.out.print("Enter Array Elements : ");
	for(i=0; i<5; i++)
	n[i]=in.nextInt();
	for(i=0; i<n.length; i++)
	System.out.println("Array element[" + i + "] : " +n[i]);
	}


}
