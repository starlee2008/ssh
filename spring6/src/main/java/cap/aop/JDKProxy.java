package cap.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class JDKProxy implements InvocationHandler {
    private Object targetObject;

    public Object newObject(Object targetObject) {
        this.targetObject = targetObject;
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
                targetObject.getClass().getInterfaces(), this);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("当前日期:" + (new Date()).toString());
        return method.invoke(targetObject, args);
    }
}
