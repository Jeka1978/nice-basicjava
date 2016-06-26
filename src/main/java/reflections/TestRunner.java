package reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Jeka on 26/06/2016.
 */
public class TestRunner {
    public void runTestMethods(Object o) throws InvocationTargetException, IllegalAccessException {
        Class<?> type = o.getClass();
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            if (method.getName().startsWith("test")||method.isAnnotationPresent(RunThisMethod.class)) {
                RunThisMethod annotation = method.getAnnotation(RunThisMethod.class);
                if (annotation != null) {
                    for (int i = 0; i < annotation.repeat(); i++) {
                        method.invoke(o);
                    }
                }else {
                    method.invoke(o);
                }
            }
        }
    }
}
