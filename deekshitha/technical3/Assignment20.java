import java.util.Arrays;
import java.util.List;
public class Assignment20 {



public static void main(String[] args) {
List<String> mylist=Arrays.asList("yash","hash","iuiygrce","abdgf","rtyhfbh");// TODO Auto-generated method stub
mylist.stream().filter(t->t.startsWith("y")).forEach(x-> System.out.println("starts with y:"+x));
mylist.stream().filter(t->t.endsWith("h")).forEach(x-> System.out.println("ends with h:"+x));
mylist.stream().filter(t->t.contains("s")).forEach(x-> System.out.println("contains s:"+x));

}



}