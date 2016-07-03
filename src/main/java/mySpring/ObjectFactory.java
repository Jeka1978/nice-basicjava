package mySpring;

import org.reflections.Reflections;

import java.util.Set;

/**
 * Created by Jeka on 03/07/2016.
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();

    private Reflections reflections = new Reflections("mySpring");

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
    }

    public <T> T createObject(Class<T> type) throws IllegalAccessException, InstantiationException {
        if (type.isInterface()) {
            Class<T> impl = config.getImpl(type);
            if (impl == null) {
                Set<Class<? extends T>> classes = reflections.getSubTypesOf(type);
                if (classes.size() != 1) {
                    throw new RuntimeException("ifc " + type + " has 0 or more than one impl, so please bind needed impl in config");
                }
                type = (Class<T>) classes.iterator().next();
            }else {
                type = impl;
            }
        }
        T t = type.newInstance();
        // I can do some magic here
        return t;
    }
}
