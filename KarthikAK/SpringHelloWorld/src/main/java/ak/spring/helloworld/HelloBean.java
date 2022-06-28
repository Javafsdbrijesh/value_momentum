package ak.spring.helloworld;

public class HelloBean 
{
	private String firstName;

	public String getfirstName() 
	{
		return firstName;
	}

	public void setfirstName(String name) 
	{
		this.firstName = name;
	}
	
	public void sayHello()
	{
		System.out.println("Hello my name is : " + this.firstName);
	}
}
