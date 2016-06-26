package reflections;

import java.lang.reflect.Field;

/**
 * Created by Jeka on 26/06/2016.
 */
public class CopyDataService {

    public <T> T copyFields(Object o1, Class<T> c2) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<?> class1 = o1.getClass();
        T o2 = c2.newInstance();
        Field[] fields = class1.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Copy.class)) {

                Field field2 = c2.getDeclaredField(field.getName());
                field2.setAccessible(true);
                field.setAccessible(true);

                field2.set(o2,field.get(o1));
            }
        }
        return o2;
    }
}
