import java.util.function.Consumer;

public class As16 {
    public static void main(String[] args) {
        
        //Consumer<Integer> consumer = a -> System.out.println(a);
        //consumer.accept(122);
        
        //List<Integer> list = Arrays.asList(1,2,3,4,5); list.stream().forEach((t) -> System.out.println(t));
        
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,8, 9,7,11);
    	list.stream().filter((t) -> t%2 == 0).forEach(t -> System.out.println(t));
        


        
        
        
    }
}
