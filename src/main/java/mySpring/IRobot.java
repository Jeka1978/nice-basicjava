package mySpring;

/**
 * Created by Jeka on 03/07/2016.
 */
public class IRobot {
    private Speaker speaker;
    private Cleaner cleaner;

    public IRobot() throws InstantiationException, IllegalAccessException {
        ObjectFactory factory = ObjectFactory.getInstance();
        speaker = factory.createObject(Speaker.class);
        cleaner = factory.createObject(Cleaner.class);
    }


    public void cleanRoom() {
        speaker.speak("I started my work");
        cleaner.clean();
        speaker.speak("I finished my work");
    }
}
