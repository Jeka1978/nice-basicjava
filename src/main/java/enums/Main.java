package enums;

/**
 * Created by Jeka on 13/06/2016.
 */
public class Main {
    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();
        for (int i = 0; i < 3; i++) {
            Person person = personFactory.createRandomPerson();
            System.out.println(person);
            if (person.getStatus() == MaritalStatus.DIVORCED) {
                System.out.println("divorced");
            }
        }

    }
}
