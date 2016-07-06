package mySpring;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by Jeka on 06/07/2016.
 */
public class BenchmarkProxyConfigurer implements ProxyConfigurer {
    @Override
    public Object wrapWithProxy(Object t, Class originalClass) {
        Class type = originalClass;
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Benchmark.class)) {
                return Proxy.newProxyInstance(type.getClassLoader(), type.getInterfaces(), new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Method classMethod = type.getMethod(method.getName(), method.getParameterTypes());
                        if (classMethod.isAnnotationPresent(Benchmark.class)) {
                            System.out.println("*********BECHMARK*************");
                            System.out.println(method.getName());
                            long before = System.nanoTime();
                            Object retVal = method.invoke(t, args);
                            long after = System.nanoTime();
                            System.out.println("End of benchmark for method " + method.getName() + " " + (after - before) + " nanos");
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
