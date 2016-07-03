package mySpring;

import org.springframework.context.annotation.Scope;

import javax.annotation.PostConstruct;

/**
 * Created by Jeka on 03/07/2016.
 */
public class IRobot {
    @InjectByType
    private Speaker speaker;
    @InjectByType
    private Cleaner cleaner;

    @PostConstruct
    public void init() {
        System.out.println(cleaner.getClass().getName());
    }

    /* public IRobot() throws InstantiationException, IllegalAccessException {
        ObjectFactory factory = ObjectFactory.getInstance();
        speaker = factory.createObject(Speaker.class);
        cleaner = factory.createObject(Cleaner.class);
    }*/


    public void cleanRoom() {
        speaker.speak("I started my work");
        cleaner.clean();
        speaker.speak("I finished my work");
    }
}
