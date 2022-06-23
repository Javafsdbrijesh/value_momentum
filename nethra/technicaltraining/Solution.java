package technicaltraining;
class Animal{
	void walk()
	{
		System.out.println("I am walking");
		}
}
class Bird extends Animal
{
	void fly()
	{
		System.out.println("I am flying");
	}
}
public class Solution extends Bird 
{
void sing()
{
	System.out.println("I am singing");
}
    public static void main(String[]args)
    {
    	Solution Bird=new Solution();
    	Bird.walk();
    	Bird.fly();
    	Bird.sing();
    }

}
    

