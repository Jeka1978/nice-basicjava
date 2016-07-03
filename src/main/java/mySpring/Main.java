package mySpring;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * Created by Jeka on 03/07/2016.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, FileNotFoundException, InvocationTargetException {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();
        System.out.println("iRobot = " + iRobot);
       /* Elf elf = ObjectFactory.getInstance().createObject(Elf.class);
        System.out.println("elf = " + elf);*/
        CleanerImpl cleaner = new CleanerImpl();
        Cleaner o = (Cleaner) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                CleanerImpl.class.getInterfaces(), (proxy, method, args1) -> {
                    System.out.println(12);
                    System.out.println(12);
                    System.out.println(12);
                    System.out.println(12);
                    return false;
                });

        System.out.println("@!$!@#!@#!@#");
        o.clean();
        System.out.println(o.equals(cleaner));
    }
}
