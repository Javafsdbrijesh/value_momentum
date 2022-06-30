
public class Animals {
	 void walk(){
	        System.out.println("I am walking");
	    }
	}
	 
	class Bird extends Animals{
	    void fly(){
	        System.out.println("I am flying");
	     }
	    void sing(){
	        System.out.println("I am singing");
	    }
	    

	 
	   public static void main(String[] args)
	    {
	    Bird bird=new Bird();
	    bird.walk();
	    bird.fly();
	    bird.sing();
	   }

}
