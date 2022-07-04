import java.util.*;
public class Asd17 {
public static void main(String args[])
{
HashMap<Integer, String> hm = new HashMap<Integer, String>(); //implements map interface
hm.put(1,"Ramu");
hm.put(2,"Venu");
hm.put(3, "Vamsi");
hm.put(4, "Rohith");
hm.put(5, "Madhu");
Iterator <Integer> it = hm.keySet().iterator(); //keyset is a method
while(it.hasNext())
{
int key=(int)it.next();
System.out.println("Roll no.: "+key+" name: "+hm.get(key));
}
}
}