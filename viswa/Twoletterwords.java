package p1;

public class Twoletterwords {
	public static void main(String []args) {
		String s= "this is the demo program it help to get cocept";
		for (String word : s.split(" "))
		{
			if (word.length()/2==1)
				if (word.length()%2 == 0)
				System.out.println(word);				
		}
	}

}
