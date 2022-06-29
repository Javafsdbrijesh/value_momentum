package swachith;

public class EcletricCar extends Car{
	public final String drive()
	{
		return"Driving Electric Car";
	}
	public static void main(String[] wheels) 
	{
		final Car car = new EcletricCar();
		System.out.print(car.drive());
	}

}