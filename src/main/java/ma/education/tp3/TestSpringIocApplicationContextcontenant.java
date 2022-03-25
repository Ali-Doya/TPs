package ma.education.tp3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringIocApplicationContextcontenant {

    public static void main(String[] args) {

        ApplicationContext appContext=new ClassPathXmlApplicationContext("spring.xml");
        Client c1 = (Client ) appContext.getBean("clt");
        System.out.println(c1.id);
        System.out.println(c1.name);

    }
}



