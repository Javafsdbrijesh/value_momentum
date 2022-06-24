
import java.util.List;
import java.util.Arrays;
public class ClassA {
public static void main(String []args) {
List<Integer> list=Arrays.asList(764,764,543,742,876,43,86,24,508,58,65,123,59,66,89,42,542);
list.stream().filter(num->num%5==0).forEach((num)->System.out.println(num));
list.stream().filter(e->e<2||e>30).filter(e->e%2==0).forEach((e)->System.out.println(e));


}
}