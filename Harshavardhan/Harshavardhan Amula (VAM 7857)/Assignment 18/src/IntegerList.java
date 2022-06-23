
import java.util.*;
 
class IntegerList{
 
    public static void main(String args[])
    {
        List<String> myList = new ArrayList<String>();
 
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");
        myList.add("F");
 
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}