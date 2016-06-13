package composite;

import java.time.LocalDateTime;

/**
 * Created by Jeka on 13/06/2016.
 */
public interface Alarm {
    void setTime(LocalDateTime dateTime);
    void stop();
}
