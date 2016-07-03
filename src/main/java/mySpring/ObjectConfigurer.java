package mySpring;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Jeka on 03/07/2016.
 */
public interface ObjectConfigurer {
    void configure(Object t) throws IllegalAccessException, FileNotFoundException, InstantiationException, InvocationTargetException;
}
