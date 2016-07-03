package mySpring;

/**
 * Created by Jeka on 03/07/2016.
 */
public class PowerCleaner implements Cleaner {
    @InjectRandomInt(min = 3,max = 7)
    private int repeat;

    @Override
    public void clean() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("SHSHSHSHSHHHHHHHH");
        }
    }
}
