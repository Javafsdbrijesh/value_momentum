package swachith;

public class Assignment5 {
	public static boolean Contains(int a[],int num)
	{
	for(int arrayelements : a)	
	{
		if(num==arrayelements)
		{
			return true;
		}
	}
	return false;
	}
public static void main(String[] args) {
	int a[]= { 2,4,33,54,66};
	System.out.println(Contains(a,4));
	
}
}