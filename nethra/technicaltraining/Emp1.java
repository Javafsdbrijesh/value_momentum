package technicaltraining;

public class Emp1 {
	    int eid,esal;
		String ename;
		int eage;
		Emp1(int eid, int esal, int eage, String ename)
		{
		this.eid=eid;
		this.esal=esal;
		this.eage=eage;
		this.ename=ename;
		}
		void dispEmp()
		{
		System.out.println("id "+eid+" sal "+esal+" age "+eage+" name "+ename+"");
		}
		public static void main(String [] args)
		{
		Emp1 e[]=new Emp1[4];
		e[0]=new Emp1(123,6540,21,"charan");
		e[1]=new Emp1(321,7645,22,"saaketh");
		e[2]=new Emp1(432,4325,23,"sneha");
		e[3]=new Emp1(213,6536,24,"avinash");
		for(Emp1 k:e)
		{
		if(k.esal>5000)
		k.dispEmp();
		}



		}
}
