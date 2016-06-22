package streams;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Jeka on 22/06/2016.
 */
@Data
@AllArgsConstructor
public class Employee {

    private Ensurance ensurance;
    private String name;
    private int Salary;
    private Company company;
}
