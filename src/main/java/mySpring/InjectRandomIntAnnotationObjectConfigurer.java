package mySpring;

import org.springframework.core.annotation.Order;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * Created by Jeka on 03/07/2016.
 */
public class InjectRandomIntAnnotationObjectConfigurer implements ObjectConfigurer {
    @Override
    public void configure(Object t) throws IllegalAccessException {
        Class<?> type = t.getClass();
        Field[] fields = type.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(InjectRandomInt.class)) {
                InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
                Random random = new Random();
                int min = annotation.min();
                int max = annotation.max();
                int value = min + random.nextInt(max - min);
                field.setAccessible(true);
                field.set(t,value);

            }
        }

    }
}
