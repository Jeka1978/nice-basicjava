package riddle;

/**
 * Created by Jeka on 26/06/2016.
 */
public class Son extends Parent {
    private int x = 12;

    public Son() {
        System.out.println(x);
    }



    public void doX() {
        System.out.println("x = " + x);
        System.out.println("SON");
    }
}
