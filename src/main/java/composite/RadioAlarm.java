package composite;

import java.time.LocalDateTime;

/**
 * Created by Jeka on 13/06/2016.
 */
public class RadioAlarm implements Radio, Alarm {
    private Alarm alarm = new AlarmImpl();
    private Radio radio = new RadioImpl();

    public RadioAlarm(Alarm alarm, Radio radio) {
        this.alarm = alarm;
        this.radio = radio;
    }

    public RadioAlarm() {
    }


    public void stop() {
        this.alarm.stop();
    }

    public void setTime(LocalDateTime dateTime) {
        this.alarm.setTime(dateTime);
    }

    public void setChannel(double channel) {
        this.radio.setChannel(channel);
    }

    public void setVolume(int volume) {
        this.radio.setVolume(volume);
    }
}
