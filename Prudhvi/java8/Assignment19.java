package java8;
 
import java.util.Arrays;
import java.util.List;
 
public class Assignment19 {
 
 
    public static void main(String[] args) {

        List<Integer> list =  Arrays.asList(1,2,3,4,5,6,8, 9,7,11);
        list.stream().filter((t) -> t%2 == 0).forEach(t -> System.out.println("Printing : " + t));
        list.stream().filter((k) -> k%3 == 0).forEach(k -> System.out.println("Printing-1 : " + k));
        list.stream().filter((t) -> t/2 ==0).forEach(t -> System.out.println("Printing-2 : " + t));
    }
 
}