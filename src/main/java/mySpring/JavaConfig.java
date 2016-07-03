package mySpring;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jeka on 03/07/2016.
 */
public class JavaConfig implements Config {
    private Map<Class, Class> ifc2Class = new HashMap<>();

    public JavaConfig() {
        ifc2Class.put(Speaker.class, PopupSpeaker.class);

    }

    @Override
    public <T> Class<T> getImpl(Class<T> type) {
        return ifc2Class.get(type);
    }
}
