import java.util.*;   
public class Traverse {
	public static void main(String args[])  
	{  
	HashMap<Integer, String> hm = new HashMap<Integer, String>();  //implements map interface  
	hm.put(1,"KAKAROT");  
	hm.put(2,"RISKY");  
	hm.put(3, "BLEED");    
	hm.put(4, "RIDDICK");  
	hm.put(5, "ZOD");  
	Iterator <Integer> it = hm.keySet().iterator();       //keyset is a method  
	while(it.hasNext())  
	{  
	int key=(int)it.next();  
	System.out.println("Roll no.: "+key+"     name: "+hm.get(key));  
	}  
	}  
	}  

