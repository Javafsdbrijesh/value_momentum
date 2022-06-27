
public class Apple {
	  Ball ball;
	  Cat cat;
	 
	    //Constructor Injection
	    public Apple(Ball ballConstructor,Cat catConstructor) {
	        this.ball = ballConstructor;
	        this.cat = catConstructor;
	    }

	    //Setter Injection
	    public void setApple(Ball ballSetter,Cat catSetter) {
	        this.ball = ballSetter;
	        this.cat = catSetter;
	    
	    }
	 
	    public static void main(String[] args) {


	          //creating object of Ball and cat
	    	Ball ball = new Ball();
	    	ball.play();
	    	
	    	Cat cat = new Cat();
	    	cat.home();
	          
	 
	    }
	 

}
