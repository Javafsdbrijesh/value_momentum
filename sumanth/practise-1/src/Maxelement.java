
public class Maxelement 
{
static void big()
{
	int a[]= {1,2,3,4,5};
	int max=0;
	for(int i=0;i<=4;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println(max);
}
public static void main(String []args)
{
	big();
}
}
