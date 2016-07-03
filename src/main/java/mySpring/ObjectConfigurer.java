package mySpring;

import java.io.FileNotFoundException;

/**
 * Created by Jeka on 03/07/2016.
 */
public interface ObjectConfigurer {
    void configure(Object t) throws IllegalAccessException, FileNotFoundException, InstantiationException;
}
