package cap.test;

import cap.service.HelloWorld;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class HelloWorldTest {

    @Test
    public void testSayHi() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        System.out.println(helloWorld.sayHi("cap"));
    }

    @Test
    public void testSayHi1() {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        HelloWorld helloWorld = (HelloWorld) factory.getBean("helloWorld");
        System.out.println(helloWorld.sayHi("cap2018"));
    }

    @Test
    public void testSayHi2() {
        ApplicationContext context = new FileSystemXmlApplicationContext("classpath:applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        System.out.println(helloWorld.sayHi("cap201x"));
    }

}
