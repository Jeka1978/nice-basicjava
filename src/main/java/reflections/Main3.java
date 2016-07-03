package reflections;

import mySpring.Cleaner;
import mySpring.CleanerImpl;

import java.lang.reflect.Proxy;

/**
 * Created by Jeka on 26/06/2016.
 */
public class Main3 {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        CopyDataService copyDataService = new CopyDataService();
        Client client = new Client("Avi", 22, "sbldjaslbdjas");
        Employee employee = copyDataService.copyFields(client, Employee.class);
        System.out.println(employee);


    }
}
