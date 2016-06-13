package nestedclasses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ref.WeakReference;

/**
 * Created by Jeka on 13/06/2016.
 */
public class ShutdownListener implements ActionListener{
    private WeakReference<ColorFrame> colorFrame;

    public ShutdownListener(ColorFrame colorFrame) {
        this.colorFrame = new WeakReference<>(colorFrame);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        colorFrame.get().setLocation(0,0);
        System.exit(1);
    }
}
