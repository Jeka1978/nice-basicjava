package mySpring;

import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Jeka on 03/07/2016.
 */
public class InjectByTypeAnnotationObjectConfigurer implements ObjectConfigurer {
    @Override
    public void configure(Object t) throws IllegalAccessException, FileNotFoundException, InstantiationException, InvocationTargetException {
        Class<?> type = t.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectByType.class)) {
                field.setAccessible(true);
                Object object = ObjectFactory.getInstance().createObject(field.getType());
                field.set(t,object);
            }
        }
    }
}
