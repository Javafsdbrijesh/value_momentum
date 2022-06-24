package advjava1;

 class Training{
	 
	 String getName(){
		 return "Generic Training";
		 }
		 void getNumberOfParticipants(){
		 System.out.println( getName() );
		 System.out.println( "Each group has n participants in " + getName());
		 }
		 }
		 class FullStackTraining extends Training{
		 String getName(){
		 return "Java Class";
		 }
		 void getNumberOfParticipants(){
		 System.out.println( getName() );
		 System.out.println( "Each group has 36 participants in " + getName() );
		 }
		 }
		 public class Solution1{
		 public static void main(String args[]){
		 Training training =new Training();
		 training.getNumberOfParticipants();


		 FullStackTraining fullStackTraining= new FullStackTraining();
		 fullStackTraining.getNumberOfParticipants();
		 }
}
