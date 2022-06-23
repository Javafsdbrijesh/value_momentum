
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
public class SupplierImp {
 

    public String get() {
        return "Hi Java ";
    }
 
    public static void main(String[] args) {

        Supplier<String> supplier = () -> " Hi Supplier! ";
        System.out.println(supplier.get());

    	List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(() -> " I am Harshavardhan from Nizamabad."));
    }
}