package Basics1;
class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
 
class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
   
}
class Parrot extends Bird{
	void sing() {
 		System.out.println("I am Singing");
 	}
 
	
}
public class Solution extends Bird {
	 public static void main(String args[]){
		 
	      Parrot bird = new Parrot();
	      bird.walk();
	      bird.fly();
	      bird.sing();
	 }
}
