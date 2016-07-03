package mySpring;

/**
 * Created by Jeka on 03/07/2016.
 */
public class MyServiceImpl implements MyService {
    @Override
    public void doWork() {
        System.out.println("Working....");
    }

    @Override
    @Benchmark
    public void drinkBeer() {
        System.out.println("Leff is good");
    }
}
