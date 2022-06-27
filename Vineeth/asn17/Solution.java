package output;

	
	class Animal {

	void walk() {
		System.out.println("I am walking");
	}
}

class Bird extends Animal{
	void fly() {
		System.out.println(" I am flying");
	}
}
public class Solution extends Bird {
	void sing() {
		System.out.println("I am singing");
	}
	
	public static void main(String args[]) {
		Solution bird = new Solution();
		bird.walk();
		bird.sing();
		bird.fly();
	}
}