package reflections;

import enums.Person;

import java.lang.reflect.*;

/**
 * Created by Jeka on 26/06/2016.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Object person = new Person();


        Class<?> type = person.getClass();

        Object o1 = type.newInstance();

        Method[] methods = type.getMethods();
        Method[] declaredMethods = type.getDeclaredMethods();
        Field[] fields = type.getFields();
        Field[] declaredFields = type.getDeclaredFields();
        int modifiers = type.getModifiers();
        Constructor<?>[] constructors = type.getConstructors();
        for (Constructor<?> constructor : constructors) {
            if (constructor.getParameterCount() == 2) {
                Object o = constructor.newInstance(1, 2);
            }
        }


    }
}
