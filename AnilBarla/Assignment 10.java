package Basics1;

class Training {
	  String getName(){
	        return "Generic Training";
	    }
	   void getNumberOfParticipants(){
	        System.out.println( "Each group has n participants  in " + getName() );
	    }
}
public class FullStackTraining extends Training{
	String getName(){
		        return "Java Class";
		        }
	void getNumberOfParticipants(){
		System.out.println( "Each group has 36 participants  in " + getName() );
	}

		 public static void main(String[] args) {
		       Training java1  = new Training();
		       System.out.println(java1.getName());
		       java1.getNumberOfParticipants();
		       FullStackTraining java2  = new FullStackTraining();
		       System.out.println(java2.getName());
		       java2.getNumberOfParticipants();
		       
		      
		       
		 }
}
