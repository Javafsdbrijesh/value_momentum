package jun1517;

public class Test {
	int count=0;
	String name="";
	static int length=10;
	final static String CONNECTION="localhost:8080";
	final static String USER_NAME="root";
	public static void main(String[]args) {
		Test hello=new Test();
		System.out.println("in main");
		System.out.println(CONNECTION+ USER_NAME);
		System.out.println(CONNECTION);
	}
}
