package reflections;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Jeka on 26/06/2016.
 */
public class Main2 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Stam stam = new Stam();
        TestRunner testRunner = new TestRunner();
        testRunner.runTestMethods(stam);
    }
}
