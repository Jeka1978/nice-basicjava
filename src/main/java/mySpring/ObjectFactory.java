package mySpring;

import org.reflections.Reflections;

import javax.annotation.PostConstruct;
import java.io.FileNotFoundException;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.*;

/**
 * Created by Jeka on 03/07/2016.
 */
public class ObjectFactory {
    private static ObjectFactory ourInstance = new ObjectFactory();
    private Config config = new JavaConfig();
    private List<ObjectConfigurer> objectConfigurers = new ArrayList<>();
    private List<ProxyConfigurer> proxyConfigurers = new ArrayList<>();
    private Map<Class, Object> singletonCache = new HashMap<>();

    private Reflections reflections = new Reflections("mySpring");

    public static ObjectFactory getInstance() {
        return ourInstance;
    }

    private ObjectFactory() {
        Set<Class<? extends ObjectConfigurer>> classes = reflections.getSubTypesOf(ObjectConfigurer.class);
        for (Class<? extends ObjectConfigurer> aClass : classes) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                try {
                    objectConfigurers.add(aClass.newInstance());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        Set<Class<? extends ProxyConfigurer>> proxyConfigurersClasses = reflections.getSubTypesOf(ProxyConfigurer.class);
        for (Class<? extends ProxyConfigurer> aClass : proxyConfigurersClasses) {
            if (!Modifier.isAbstract(aClass.getModifiers())) {
                try {
                    proxyConfigurers.add(aClass.newInstance());
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public <T> T createObject(Class<T> type) throws Exception {
        Class<T> impl = resolveImpl(type);
        T t = impl.newInstance();
        configure(t);
        invokeInitMethod(impl, t);
        for (ProxyConfigurer proxyConfigurer : proxyConfigurers) {
            t = (T) proxyConfigurer.wrapWithProxy(t,impl);
        }

        return t;
    }









    private <T> void invokeInitMethod(Class<T> type, T t) throws IllegalAccessException, InvocationTargetException {
        Method[] methods = type.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(PostConstruct.class)) {
                method.invoke(t);
            }
        }
    }


   /* public <T> T createObject(Class<T> type) throws FileNotFoundException,IllegalAccessException, InstantiationException {
        type = resolveImpl(type);
        T t;
        if (type.isAnnotationPresent(Singleton.class)) {
            if (singletonCache.containsKey(type)) {
                return (T) singletonCache.get(type);
            }else {
                t = type.newInstance();
                configure(t);
                singletonCache.put(type, t);
            }
        }else {

            t = type.newInstance();
            configure(t);
        }
        return t;
    }*/


    private <T> Class<T> resolveImpl(Class<T> type) {
        if (type.isInterface()) {
            Class<T> impl = config.getImpl(type);
            if (impl == null) {
                Set<Class<? extends T>> classes = reflections.getSubTypesOf(type);
                if (classes.size() != 1) {
                    throw new RuntimeException("ifc " + type + " has 0 or more than one impl, so please bind needed impl in config");
                }
                type = (Class<T>) classes.iterator().next();
            } else {
                type = impl;
            }
        }
        return type;
    }

    private <T> void configure(T t) throws Exception {
        for (ObjectConfigurer objectConfigurer : objectConfigurers) {
            objectConfigurer.configure(t);
        }
    }
}











