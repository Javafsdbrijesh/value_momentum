interface Test2 {
    
    void print(Integer p);
}
interface Test3 {
  
    void print1(Integer p1, Integer p2);
}
interface Test4 {
    
    void print2(Integer p1, Integer p2, Integer p3);
}
 
class Testt {
    
    static void fun(Test2 t, Integer p)
    {
        
        t.print(p);
    }
    static void fun1(Test3 t1, Integer p1, Integer p2)
    {
        t1.print1(p1, p2);
    }
    static void fun2(Test4 t2, Integer p3,Integer p4,Integer p5)
    {
        t2.print2(p3,p4,p5);
    }
    public static void main(String[] args)
    {
        
        fun(p -> System.out.println(p), 10);
        fun1((p1, p2)-> System.out.println(p1 + " " + p2),
            10, 20);
        fun2((p3,p4,p5) -> System.out.println(p3 + " " + p4+" "+p5), 10,20,30);
    }
}