package nestedclasses;

/**
 * Created by Jeka on 13/06/2016.
 */
public class Main {
    public static void main(String[] args) {
        Employee.Builder builder = new Employee.Builder();
        Employee employee = builder.bonus(100).salary(2000).build();
        System.out.println(employee);
    }
}
