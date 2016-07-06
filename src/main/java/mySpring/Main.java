package mySpring;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * Created by Jeka on 03/07/2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ObjectFactory factory = ObjectFactory.getInstance();
        IRobot iRobot = factory.createObject(IRobot.class);
        Object object = factory.createObject("mySpring.IRobot");
        iRobot.cleanRoom();

        /*MyService myService = ObjectFactory.getInstance().createObject(MyService.class);
        myService.doWork();
        myService.drinkBeer();*/
    }
}
