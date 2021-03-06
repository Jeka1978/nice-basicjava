package files;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by Jeka on 20/06/2016.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Serializable, Comparable<Person>{
    private String name;
    private transient int age;

    @Override
    public int compareTo(Person person) {
        return this.name.compareTo(person.name);
    }
}
