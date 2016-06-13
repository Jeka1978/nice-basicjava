package nestedclasses;

/**
 * Created by Jeka on 13/06/2016.
 */
public class Employee {
    private int salary;
    private int bonus;

    private Employee() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("salary=").append(salary);
        sb.append(", bonus=").append(bonus);
        sb.append('}');
        return sb.toString();
    }

    private Employee(int salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public static class Builder{
        private int salary;
        private int bonus;

        public Builder salary(int salary) {
            this.salary = salary;
            return this;
        }

        public Builder bonus(int bonus) {
            this.bonus = bonus;
            return this;
        }

        public Employee build(){
            validate();
            return new Employee(salary, bonus);
        }

        private void validate() {
            if (bonus > salary) {
                throw new RuntimeException("illegal bonus");
            }
        }
    }
}
