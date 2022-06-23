package technicaltraining;
interface Test1
{
void print();
}
public class Assignment15 {
	static void sum(Test1 t) {t.print();}
public static void main(String[]args)
{
	//with no parameters//
	sum(()->System.out.println("with no parameters"));
	
}
}
