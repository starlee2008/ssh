package cap.service.impl;

import cap.service.HelloWorld;

public class HelloWorldBeanFactory implements HelloWorld {

    public static HelloWorld creatHelloWorldBean() {
        return new HelloWorldImpl();
    }

    public HelloWorld creatHelloWorldBean2() {
        return new HelloWorldImpl();
    }

    @Override
    public String sayHi(String name) {
        return "欢迎您：" + name + "学习Spring技术";
    }
}
