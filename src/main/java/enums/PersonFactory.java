package enums;

import org.fluttercode.datafactory.impl.DataFactory;

/**
 * Created by Jeka on 13/06/2016.
 */
public class PersonFactory {
    private DataFactory dataFactory = new DataFactory();

    public Person createRandomPerson(){
        Person person = new Person();
        person.setName(dataFactory.getName());
        int dbCode = dataFactory.getNumberBetween(1, 3);
        person.setStatus(MaritalStatus.findByDbCode(dbCode));
        return person;
    }
}
