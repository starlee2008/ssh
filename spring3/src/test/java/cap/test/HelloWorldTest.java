package cap.test;

import cap.service.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    @Test
    public void testSayHi1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld1");
        System.out.println(helloWorld.sayHi("cap2018"));

    }

    @Test
    public void testSayHi2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld2");
        System.out.println(helloWorld.sayHi("cap201x"));

    }

    @Test
    public void testSayHi3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld3");
        System.out.println(helloWorld.sayHi("cap2018x"));

    }

    @Test
    public void testScope() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld h1 = (HelloWorld) context.getBean("helloWorld3");
        HelloWorld h2 = (HelloWorld) context.getBean("helloWorld3");
        System.out.println(h1.equals(h2));

    }
}
