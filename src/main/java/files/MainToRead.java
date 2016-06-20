package files;

import java.util.List;

/**
 * Created by Jeka on 20/06/2016.
 */
public class MainToRead {
    public static void main(String[] args) {
        FileWriterReader reader = new FileWriterReader();
        List<Person> persons= null;
        try {
            persons = (List<Person>) reader.readObjectFromFile("c:\\temp\\persons\\p.txt");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(persons.get(1));

    }
}
