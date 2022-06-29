package swachith;
class Animal
{
   void fly()
   {
	   System.out.println("I am flying");
   }
}
class Bird extends Animal
{
	void walk()
	{
		System.out.println("I am walking");
	}
	void sing()
	{
		System.out.println("I am singing");
	}
}
public class Assignment9bird {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();
		bird.walk();
		bird.sing();
		
}
}