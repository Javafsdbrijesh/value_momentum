import java.util.*;
public class Sorts {

	public static void main(String[] args) {
		int[] a=new int[] {4,2,3,1,5};
		int temp;
		String temp1;
		String[] stringArray=new String[] {"a","g","d","c","b","f"};
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length-1;j++)
			{
				if(a[j-1]>a[j])
				{
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
				
			}
		}
		
		for(int i=0;i<stringArray.length-1;i++)
		{
			for(int j=i+1;j<stringArray.length;j++)
			{
				if(stringArray[i].compareTo(stringArray[j])>0)
				{
					temp1=stringArray[i];
					stringArray[i]=stringArray[j];
					stringArray[j]=temp1;
				}
				
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		for(int i=0;i<stringArray.length;i++)
		{
			System.out.print(stringArray[i]);
		}
		
	}

}
