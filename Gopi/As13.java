public class As13{
    
    public static void main(String[] args) {
        

        StringBuffer str = new StringBuffer("Hello  ");
       
        str.append("all");
        str.replace(0, 2, "yh");
        str.delete(0, 2);
        System.out.println(str);

    }
}   