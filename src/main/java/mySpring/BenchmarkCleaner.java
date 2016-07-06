package mySpring;

/**
 * Created by Jeka on 03/07/2016.
 */
public class BenchmarkCleaner extends PowerCleaner {



    @Override
    public void clean() {
        long before = System.nanoTime();
        super.clean();
        long after = System.nanoTime();
        System.out.println(after-before);
    }
}
