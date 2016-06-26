package tdd;

/**
 * Created by Jeka on 26/06/2016.
 */
public class MaamResolver2 {
    private static MaamResolver2 ourInstance = new MaamResolver2();

    public static MaamResolver2 getInstance() {
        return ourInstance;
    }

    private MaamResolver2() {
    }

    public double getMaam() {
        return 0.18;
    }
}
