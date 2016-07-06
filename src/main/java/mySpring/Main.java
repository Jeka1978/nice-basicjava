package mySpring;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * Created by Jeka on 03/07/2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();

        /*MyService myService = ObjectFactory.getInstance().createObject(MyService.class);
        myService.doWork();
        myService.drinkBeer();*/
    }
}
