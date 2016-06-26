package reflections;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Jeka on 26/06/2016.
 */
@Data
@AllArgsConstructor
public class Client {
    @Copy
    private String name;
    @Copy
    private int age;
    private String address;
}
