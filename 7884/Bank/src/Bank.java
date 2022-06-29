class Bank{
	int bid,amnt;
String bname;
double pfinterest;
void pfloan(){
	System.out.println(bid+" "+bname);
	System.out.println("PF loan");
pfinterest=amnt*12/100.0;
System.out.println("Amount"+amnt+" pfinterest "+pfinterest);
}
}
class AB extends Bank{
	String branch, bloc;
	double vloan;
	AB(int i,String bn, int am, String br, String bl){

bid=i;

bname=bn;

amnt=am;

branch=br;
bloc=bl;

void vloan(){

vloan-amnt*15/100.0;

System.out.println(branch+"

I

class SBH extends Bank{

String branch, bloc; double mloan;

SBH(int i, String bn, int am, String br, St bid=i;

namnt-am;

branch=br;

bloc=bl; }

tvoid mloan(){ jmloan-amnt 18/100.0;

System.out.println(branch+" "+bloc+" "+"Mloan "+mloan);

}

}class BankEx{

public static void main(String[]arg){ if(arg[0].equals("AB"))

AB s=new AB (101, "AB", 100000, "Gandhi Nagar", "SBad");

s.pfloan(); s.vloan();

else if(arg[0].equals("SBH"))

SBH e=new SBH(2101, "SBH", 40000, "Jawahar Nagar", "Kukatpally"); e.mloan();