package moonearth;

public class Moonearth 
{
	double myearthweight = 66;
	double mymoonweight;
void moonweight()
{
	mymoonweight= myearthweight*0.17;
	System.out.println(mymoonweight);
}
 
public static void main(String []args)
{
	Moonearth w = new Moonearth();
	w.moonweight();
}
}
