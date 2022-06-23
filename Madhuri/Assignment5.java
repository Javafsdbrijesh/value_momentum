
public class Assignment5 {
	public static boolean Contains(int a[],int num)
	{
	  for(int ArrayEle:a)
	  {
		  if(num==ArrayEle)
		  {
			  return true;
		  }
		  
			  
	  }
	  return false;
	}
	public static void main(String args[])
	{
		int a[]= {3,6,2,16,8};
		System.out.println(Contains(a,0));
	}

}
