package asd8;

public class ElectricCar extends Car{
public final String drive()
{
return"Driving Electric Car";
}
public static void main(String[] wheels)
{
final Car car = new ElectricCar();
System.out.print(car.drive());
}
}