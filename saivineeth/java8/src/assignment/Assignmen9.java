package assignment;

class Automobile {
    private String drive() {
        return "Driving vehicle";
    }
}
 
class Car extends Automobile {
    protected String drive() {
        return "Driving car";
    }
}
 
public class Assignmen9 extends Car {
 
    @Override
    public final String drive() {
        return "Driving electric car";
    }
 
    public static void main(String[] wheels) {
        final Car car = new Car();
        System.out.print(car.drive());
    }
}