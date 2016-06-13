package composite;

/**
 * Created by Jeka on 13/06/2016.
 */
public class RadioImpl implements Radio {
    private double channel;

    @Override
    public void setChannel(double channel) {
        this.channel = channel;
    }

    @Override
    public void setVolume(int volume) {

    }
}
