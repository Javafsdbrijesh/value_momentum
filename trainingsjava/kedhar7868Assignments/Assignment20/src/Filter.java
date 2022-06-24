import java.util.*;
class Filter{
public static void main(String[] args)
{
List<Integer> l2 = new ArrayList<Integer>();
l2.add(1);
l2.add(2);
l2.add(3);
l2.add(4);
l2.add(5);
l2.add(6);


for (int i = 0; i < l2.size(); i++) {
System.out.println(l2.get(i));

l2.stream().forEach(x -> System.out.println(x));
l2.stream().filter (x->x/2 ==0).forEach(y ->System.out.println(y));
}




}
}