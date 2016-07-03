package mySpring;

import java.io.FileNotFoundException;

/**
 * Created by Jeka on 03/07/2016.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, FileNotFoundException {
        IRobot iRobot = ObjectFactory.getInstance().createObject(IRobot.class);
        IRobot iRobot2 = ObjectFactory.getInstance().createObject(IRobot.class);
        iRobot.cleanRoom();
        System.out.println("iRobot = " + iRobot);
        System.out.println("iRobot2 = " + iRobot2);
       /* Elf elf = ObjectFactory.getInstance().createObject(Elf.class);
        System.out.println("elf = " + elf);*/
    }
}
