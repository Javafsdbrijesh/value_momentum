
public class Findtwoletter {
	
		public static void main(String[] args)
		{
		String s = "this is a demo program it helps to get concept";
		for(String word : s.split(" "))
		{
		if(word.length()/2 == 1 && word.length()%2==0)
			
		      System.out.println(word);
		}
		}
}
