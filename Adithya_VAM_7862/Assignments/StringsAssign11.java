package jun1517;
//Assignment 11: Create Strings using two different ways and check weather their references are equal or not.
public class StringsAssign11 {
	public static void main(String[]args) {
		String frst="Karthik";
		String scnd=new String("Karthik");
		if(frst.equals(scnd)) {
			System.out.println("Same");
		}
	}
}
