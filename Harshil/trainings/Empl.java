package trainings;

public class Empl {
	int eid,esal;
	String ename;
	Empl(int eid,int esal,String ename){
	this.eid=eid;
	this.esal=esal;
	this.ename=ename;
	}
	void display() {
	System.out.println("id"+eid+"name"+ename+"salary"+esal);
	}
	public static void main(String [] arg) {
	Empl e[]=new Empl[5];
	e[0]=new Empl(222,5456,"pooja");
	e[1]=new Empl(111,4567,"ravi");
	e[2]=new Empl(333,5123,"harshil");
	for(Empl k: e)
	if(k.esal>5000)
	k.display();
	}
		}


