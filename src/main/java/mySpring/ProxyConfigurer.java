package mySpring;

/**
 * Created by Jeka on 06/07/2016.
 */
public interface ProxyConfigurer {
    Object wrapWithProxy(Object t,Class originalClass);
}
