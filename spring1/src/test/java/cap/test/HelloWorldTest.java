package cap.test;

import cap.service.HelloWorld;
import cap.service.impl.HelloWorldImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    @Test
    public void testSayHi() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        System.out.println(helloWorld.sayHi("starlee"));
    }

    @Test
    public void testSayHi2() {
        HelloWorld helloWorld = new HelloWorldImpl();
        System.out.println(helloWorld.sayHi("starlee2"));
    }
}
