package java;

public class StringRefence {
	StringRefence()
	{
		String s="welcome";
		String s1=new String("Welcome");
		if(s.equals(s1))
		{
			System.out.println("The two strings are equal");
		}
	}
	public static void main(String args[])
	{
		StringRefence sr=new StringRefence();
	}

}
