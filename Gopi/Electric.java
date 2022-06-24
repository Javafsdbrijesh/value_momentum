    public class Electric extends Car {
 
        @Override
        public final String drive() {
            return "Driving electric car";
        }
     
        public static void main(String[] wheels) {
            final Car car = new Electric();
            System.out.print(car.drive());
        }
    }

