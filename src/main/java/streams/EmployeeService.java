package streams;

import java.util.List;
import java.util.Optional;

/**
 * Created by Jeka on 22/06/2016.
 */
public class EmployeeService {
    public void printIDIEmployeeSalariesSortedByCompanyRevenue(List<Employee> employees) {
        employees.parallelStream()
                .filter(employee -> employee.getEnsurance()==Ensurance.IDI)
//                .peek(System.out::println)
//                .sorted((e1, e2) -> e1.getCompany().getRevenue()-e2.getCompany().getRevenue())
                .sorted(EmployeeComparator::compareByCompanyRevenue)
                .sequential()
                .sorted(EmployeeComparator::compareByCompanyRevenue)
                .sorted(EmployeeComparator::compareByCompanyRevenue)
                .sorted(EmployeeComparator::compareByCompanyRevenue)
                .sorted(EmployeeComparator::compareByCompanyRevenue)
                .parallel()
                .sorted(EmployeeComparator::compareByCompanyRevenue)
                .map(Employee::getSalary).distinct()
                .forEach(System.out::println);
    }

    public int totalEmployeesPayment(List<Employee> employees){
        return employees.stream()
                .mapToInt(Employee::getSalary).sum();
    }

 public String chainEmployeeNames(List<Employee> employees){
     Optional<String> chained = employees.stream().map(Employee::getName)
             .reduce((e1, e2) -> e1 + e2);
     if (chained.isPresent()) {
         return chained.get();
     }else {
         return "";
     }
 }



















}
