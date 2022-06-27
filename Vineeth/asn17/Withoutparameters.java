package assignments;
interface Test1 {
	
void print();
}
public class Withoutparameters {
	static void fun(Test1 t)
	{
		t.print();
	}

	public static void main(String[] args) {
		// lambda expression is passed 
		fun(() -> System.out.println("Hello Google"));
		

	}

}
