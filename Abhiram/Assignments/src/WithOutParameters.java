//Assignment 16: Create 4 methods (having no parameters, having one parameter, having 2 parameters, having 3 parameters)  and convert them in anonymous functions and write lambda expression for the same.

interface Test1 {
    void print();
}
 
public class WithOutParameters {
		// TODO Auto-generated method stub
		 static void fun(Test1 t) { t.print(); }
		    public static void main(String[] args)
		    {
		        // lambda expression is passed
		        // without parameter to functional interface t
		        fun(() -> System.out.println("Hello"));
		    }

	}