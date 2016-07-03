package mySpring;

/**
 * Created by Jeka on 03/07/2016.
 */
public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
      /*  IRobot iRobot = new IRobot();
        iRobot.cleanRoom();*/
        Elf elf = ObjectFactory.getInstance().createObject(Elf.class);
        System.out.println("elf = " + elf);
    }
}
