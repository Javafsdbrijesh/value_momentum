package training11;

public class Training {

	String getName() {
		return "Generic Training";
	}
	void getNumberOfParticipants() {
		System.out.println("Each group has n participants in " + getName());
	}
}
class FullStackTraining extends Training {
	String getName() {
		return "Java Class";
	}
	void getNumberOfParticipants() {
		System.out.println("Each group has 36 participants in " + getName());
	}
	public static void main(String[] args) {
	Training java1 = new Training();
	System.out.println(java1.getName());
	java1.getNumberOfParticipants();
	FullStackTraining java2 = new FullStackTraining();
	java2.getNumberOfParticipants();
	}
}
