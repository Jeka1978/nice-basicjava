package mySpring;

import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Jeka on 06/07/2016.
 */
public class TransactionalProxyConfigurer implements ProxyConfigurer {
    @Override
    public Object wrapWithProxy(Object t, Class originalClass) {
        Class type = originalClass;
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Transactional.class)) {
                if (type.getInterfaces().length == 0) {
                    return Enhancer.create(type, new org.springframework.cglib.proxy.InvocationHandler() {
                        @Override
                        public Object invoke(Object o, Method method, Object[] args) throws Throwable {
                            Method classMethod = type.getMethod(method.getName(), method.getParameterTypes());
                            if (classMethod.isAnnotationPresent(Transactional.class)) {
                                System.out.println("*********Transaction OPENED*************");
                                Object retVal = method.invoke(t, args);
                                System.out.println("*********Transaction Commited*************");
                                return retVal;
                            } else {
                                return method.invoke(t, args);
                            }

                        }
                    });
                }
                return Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Method classMethod = type.getMethod(method.getName(), method.getParameterTypes());
                        if (classMethod.isAnnotationPresent(Transactional.class)) {
                            System.out.println("*********Transaction OPENED*************");
                            Object retVal = method.invoke(t, args);
                            System.out.println("*********Transaction Commited*************");
                            return retVal;
                        } else {
                            return method.invoke(t, args);
                        }
                    }
                });
            }
        }
        return t;
    }
}
