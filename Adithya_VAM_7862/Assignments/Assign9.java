package jun1517;
//Assignment 9: In the below code, a bird can walk and fly, write another feature so that bird can sing as well.

class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
 
class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    void sing() {
    	System.out.println("Hey, Iam Singing here");
    }
}
public class Solution{
 
   public static void main(String args[]){
 
      Bird bird = new Bird();
      bird.walk();
      bird.fly();
      bird.sing();

   }
}