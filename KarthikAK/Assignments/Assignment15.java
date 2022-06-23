/*Create 4 methods (having no parameters, having one parameter, having 2 parameters, having 3 parameters) 
 * and convert them in anonymous functions and write lambda expression for the same.*/

package Assignments;

public class Assignment15 {

	public static void main(String[] args) {
		// with no parameter
		() -> System.out.println("with no parameters");
		// with one parameter
		(x) -> System.out.println("with one parameter: " + x);
		// with two parameters
		(x,y) -> System.out.println("with two parameters: " + x + "," + y);
		// with three parameters
		(x,y,z) -> System.out.println("with three parameters: " + x + "," + y + "," + z);
	}

}