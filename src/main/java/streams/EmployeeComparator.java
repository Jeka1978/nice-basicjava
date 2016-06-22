package streams;

/**
 * Created by Jeka on 22/06/2016.
 */
public class EmployeeComparator {
    public static int compareByCompanyRevenue(Employee e1, Employee e2) {
        return e1.getCompany().getRevenue() - e2.getCompany().getRevenue();
    }
}
