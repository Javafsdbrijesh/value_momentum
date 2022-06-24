package advjava1;
import java.util.function.Supplier; 
public class Assignment16Supplier {
 public static void main(String[] args) {
        Supplier<String> s1 = ()->"Hello valuemomentum";
        System.out.println(s1.get());        
        Supplier<Integer> s2 = ()->10;
        System.out.println(s2.get()); 

        
    }
}
