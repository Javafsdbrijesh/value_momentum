
interface Test1
{
	void display();
}
interface Test2
{
	void display(Integer i);
}
interface Test3
{
	void display(Integer x,Integer y);
}
interface Test4
{
	void display(Integer a,Integer b,Integer c);
}

public class As15 {
	  static void fun(Test1 t) { t.display(); }
	  static void fun(Test2 t, Integer i)
	  {
		  t.display(i);
	  }
	  static void fun(Test3 t, Integer x, Integer y)
	  {
		  t.display(x, y);
	  }
	  static void fun(Test4 t,Integer a,Integer b,Integer c)
	  {
		  t.display(a, b, c);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun( () -> System.out.println("no parameters"));
		fun(i -> System.out.println(i + " one parameter"), 10);
		fun((x, y) -> System.out.println(x + " "+ y + " two paramters"),10,20);
		fun((a,b,c) -> System.out.println(a+" "+b+ " "+c+ " three parameters"),1,2,3);
		

	}

}
