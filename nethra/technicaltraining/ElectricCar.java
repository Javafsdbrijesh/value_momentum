package technicaltraining;

public class ElectricCar extends Car 
{
     public final String drive()
     {
    	 return"Driving electric car";
    	 
    }
     public static void main(String[]wheels)
     {
    	 final Car car=new ElectricCar();
    	 System.out.println(car.drive());
    	 
    	 
     }
}
