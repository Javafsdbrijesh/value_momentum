package technicaltraining;

public class add {
	int a;
	int b;
	int c;
	
	public void perform()
	{
       c=a=b;
	}
}
public class objectdemo
{
	public static void main(String args[])
	{
		add obj=new add();
		obj.a=1;
				obj.b=2;
				obj.perform();
				System.out.println(obj.c);
	}
}