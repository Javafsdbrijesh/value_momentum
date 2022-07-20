package advjava4;
import java.util.Arrays;
import java.util.List;
public class Assignment16Consumer {
	 
public void accept(String t) {
     System.out.println("Say: " + t);
    }

  public static void main(String[] args) {
     
	List<String> list =  Arrays.asList("Welcome to Valuemomentum");
    list.stream().forEach((t) -> System.out.println("Say : " + t));
      
      
  }

}
