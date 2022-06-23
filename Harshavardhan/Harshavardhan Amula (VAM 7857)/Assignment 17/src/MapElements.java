import java.util.*;
 
class MapElements{
    public static void main(String[] args)
    {
        HashMap<String, Integer> Harsha= new HashMap<String, Integer>();
        Harsha.put(" Mouse    ", 34);
        Harsha.put(" Computer ", 12);
        Harsha.put(" KeyBoard ", 78);
 
        System.out.println("Created Hashmap is" + Harsha);
 
        Iterator HarshaIterator = Harsha.entrySet().iterator();
        System.out.println("HashMap after adding bonus marks:");
 

        while (HarshaIterator.hasNext()) {
 
            Map.Entry mapElement= (Map.Entry)HarshaIterator.next();
            int marks = ((int)mapElement.getValue() + 8);
            System.out.println(mapElement.getKey() + " : "+ marks);
        }
    }
}