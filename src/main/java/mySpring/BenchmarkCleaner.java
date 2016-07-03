package mySpring;

/**
 * Created by Jeka on 03/07/2016.
 */
public class BenchmarkCleaner implements Cleaner {

    @InjectByType
    private PowerCleaner cleaner;

    @Override
    public void clean() {
        long before = System.nanoTime();
        cleaner.clean();
        long after = System.nanoTime();
        System.out.println(after-before);
    }
}
