package cap.util;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Date;

public class AdminInterceptor implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        String info = methodInvocation.getMethod().getDeclaringClass().getName() + "."
                + methodInvocation.getMethod().getName() + "()";
        System.out.println(info);
        Object result = null;
        try {
            result = methodInvocation.proceed();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("记录中:现在时间是:" + new Date().toString());
        }
        return result;

    }

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("记录后:现在时间是:" + new Date().toString());

    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("记录前:现在时间是:" + new Date().toString());

    }
}
