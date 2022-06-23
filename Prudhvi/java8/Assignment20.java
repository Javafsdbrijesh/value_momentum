package java8;
import java.util.Arrays;
import java.util.List;



public class Assignment20 {
public static void main(String []args) {
List<String> b = Arrays.asList("Abs","Guns","Gang","RRR","Kgf","Svp","Ssr","Ams");
b.stream().filter(t -> t.startsWith("S")).forEach(x -> System.out.println("Starts with S :"+x));

b.stream().filter(t -> t.endsWith("s")).forEach(x -> System.out.println("Ends with s : "+x));

b.stream().filter(t -> t.contains("g")).forEach(x -> System.out.println("Contains g : "+x));

}



}