import java.util.Arrays;
import java.util.List;
 
public class ConsumerImp {
 
    public void accept(Integer t) {
        System.out.println("Printing : " + t);
        
    }
 
    public static void main(String[] args) {
     


        List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,8);

        list.stream().forEach((t) -> System.out.println("Printing : " + t));
    }
 
}