package jun1517;
//Assignment 14: Create a String "valuemomentum", call substring method  for index 6 to 11, Explain line by line how substring works, How it was creating memory leak before jdk 7.
public class Assign14 {
	public static void main(String[]args) {
		String karthik="valuemomentum";
		System.out.println(karthik.substring(6,11));
		//substring is used create smaller strings from bigger ones, strings are immutable in java and this returns a new strings.
		//berfore java7 it used to leak memory even we give string as null it wont be getting into garbage value and hence we are wasting memory, it was fixed after java 7
	}

}
