package java;
import java.util.Arrays;
import java.util.List;

public class Assignment16 
{
 public static void main(String sai[]) {
	
	List<Integer> list = Arrays.asList(1,2,3,4,5); list.stream().forEach((t) -> System.out.println("Printing : " + t));
	}
}