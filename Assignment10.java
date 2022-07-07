class Training{
    String getName(){
        return "Generic Training";
    }
    void getNumberOfParticipants(){
    	System.out.println(  getName() );
        System.out.println( "Each group has n participants  in " + getName() );
    }
}
class FullStackTraining extends Training{
    @Override
    String getName(){
        return "Java Class";
    }
    void getNumberOfParticipants(){
    	System.out.println(  getName() );
        System.out.println( "Each group has 36 participants  in " + getName() );
    }
}
public class Assignment10 {
	public static void main(String[]arg) {
		Training fst=new Training();
		FullStackTraining er=new FullStackTraining();
		fst.getNumberOfParticipants();
		er.getNumberOfParticipants();
	}

}
