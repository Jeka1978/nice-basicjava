package mySpring;

/**
 * Created by Jeka on 03/07/2016.
 */
@Benchmark
public class ConsoleSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
