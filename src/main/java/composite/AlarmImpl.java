package composite;

import java.time.LocalDateTime;

/**
 * Created by Jeka on 13/06/2016.
 */
public class AlarmImpl implements Alarm {
    @Override
    public void setTime(LocalDateTime dateTime) {
        //10 LINES OF CODE
        System.out.println(dateTime);
    }

    @Override
    public void stop() {
        //7 lines of code
        System.out.println("Stopped");
    }
}
