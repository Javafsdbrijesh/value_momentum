
interface Test1
{
    void print();
}
interface Test2
{
    void print(Integer p);
}
interface Test3
{
    void add(Integer s1,Integer s2);
}
interface Test4
{
    void mul(Integer s1,Integer s2,Integer s3);
}
public class Lambdaexpression {
     static void say(Test1 t){
         t.print();
     }
     static void num(Test2 t, Integer p){
         t.print(p);
     }
     static void add(Test3 t,Integer s1,Integer s2){
         t.add(s1,s2);
     }
     static  void mul(Test4 t,Integer s1,Integer s2,Integer s3) {
        t.mul(s1,s2,s3);
     }
     public static void main(String[] args) {
        say(()->System.out.println("hello valuemomentum"));
        num(p->System.out.println(p),10);
        add((s1,s2)->System.out.println(s1+s2 + " "),10,5);
        mul((s1,s2,s3)->System.out.println(s1*s2*s3 + " "),10,5,4);
    }
}