package studentclass;

public class Employee {
	int eid= 7881,ebasic=30000;
	String ename;
	double etax,esal,enet;
	void calded()
	{
	double	etax=ebasic*0.02;
	int	enet=(int)(ebasic-etax);
	System.out.println(enet);
	}
	void disemp()
	{
		System.out.println(eid);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
        e.calded();
        e.disemp();
	}

}
