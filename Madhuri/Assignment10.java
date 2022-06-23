
class Training{
    String getName(){
        return "Generic Training";
    }
   public void getNumberOfParticipants(){
        System.out.println( "Each group has n participants in " + getName() );
    }
	
}
class FullStackTraining extends Training{
    String getName(){
        return "Java Class";
    }
    public void getNumberOfParticipants()
    {
    	int n=36;
    	System.out.println("Each group has " + n + " partcipants in " + getName() );
    }
    
}
public class Assignment10
{
	public static void main(String args[])
	{
		Training t1=new Training();
		String s=t1.getName();
		System.out.println(s);
		
		t1.getNumberOfParticipants();
		
		FullStackTraining t=new FullStackTraining();
	
		String s1=t.getName();
		System.out.println(s1);
		t.getNumberOfParticipants();
	}
}