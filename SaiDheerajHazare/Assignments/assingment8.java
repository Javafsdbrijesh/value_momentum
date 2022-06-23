
public class assingment8 {
	public static void main(String[] args) {
		String arraydubs[]= {"a","b","a","c","b"};
		
		for(int i=0;i<arraydubs.length-1;i++)
		{
			for(int j=i;j<arraydubs.length;j++)
			{
				if(arraydubs[i].equals(arraydubs[j]) && (i != j)) {
					System.out.println("dublicate elements are: "+arraydubs[j]);
				}
						
			}
		}

	}

}
