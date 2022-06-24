//Assignment 16: Create 4 methods (having no parameters, having one parameter, having 2 parameters, having 3 parameters)  and convert them in anonymous functions and write lambda expression for the same.

interface Test2 {
    void print(Integer p);
}
public class OneParameter {
		// TODO Auto-generated method stub
		 static void fun(Test2 t, Integer p)
		    {
		        // calls the print function
		        t.print(p);
		    }
		    public static void main(String[] args)
		    {
		       
		        fun(p -> System.out.println(p), 10);
		    }

	}


