package day2;

public class Automobile
{
    private String drive()
    {
		return "Driving vechile";
    }
}
class Car extends Automobile
{
	protected String drive()
	{
		return"Driving Car";
	}
}
