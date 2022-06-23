
import java.util.*;

class Fliter {
    public static void main(String args[])
    {
        List<String> al = new ArrayList<>();
        al.add("Dog");
        al.add("Cat");
        al.add("Rat");
       
        al.stream().forEach(x -> System.out.println(x));

        al.stream().filter(t -> t.startsWith("C")).forEach(x ->System.out.println(x));
    }
}
