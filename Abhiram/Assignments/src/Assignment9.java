//Assignment 9:What is the output of the following application?

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
public class Assignment9 extends Car {
 
    @Override
    public final String drive() {
        return "Driving electric car";
    }
    public static void main(String[] wheels) {
        final Car car = new Assignment9();
        System.out.print(car.drive());
    }
}