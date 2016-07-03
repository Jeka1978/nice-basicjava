package mySpring;

/**
 * Created by Jeka on 03/07/2016.
 */
public interface Config {
    <T> Class<T> getImpl(Class<T> type);
}
