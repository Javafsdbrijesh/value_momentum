
interface Test1 {
    void print();
}
 
public class WithoutParameters {
		// TODO Auto-generated method stub
		 static void fun(Test1 t) { t.print(); }
		    public static void main(String[] args)
		    {
		        // lambda expression is passed
		        // without parameter to functional interface t
		        fun(() -> System.out.println("Hello"));
		    }

	}
