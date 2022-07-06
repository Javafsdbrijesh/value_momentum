package hellobeansExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class assignment36 {
    private static ApplicationContext helloBean;
    public static void main(String[] args) {
        helloBean = new ClassPathXmlApplicationContext("beans.xml"); 
        HelloBean hello = (HelloBean) helloBean.getBean("HelloBean");
        hello.sayHello();
    }
}
