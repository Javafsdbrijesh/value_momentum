//Assignment 16: Create 4 methods (having no parameters, having one parameter, having 2 parameters, having 3 parameters)  and convert them in anonymous functions and write lambda expression for the same.

interface Test4 {
    void print(Integer p1, Integer p2);
}

public class ThreeParameters {

	static void fun(Test4 t, Integer p1, Integer p2)
    {
        // calls the print function
        t.print(p1, p2);
    }
    public static void main(String[] args)
    {
        fun((p1, p2)-> System.out.println(p1 + " " + p2),10, 20);
    }
}