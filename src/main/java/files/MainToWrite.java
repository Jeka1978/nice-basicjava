package files;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Jeka on 20/06/2016.
 */
public class MainToWrite {
    public static void main(String[] args) throws IOException {
        FileWriterReader fileWriterReader = new FileWriterReader();
        List<Person> persons = Arrays.asList(new Person("Efim", 46), new Person("Ida", 18));
        fileWriterReader.saveObject("c:\\temp\\persons\\p.txt",persons);
//        fileWriterReader.saveObject("c:\\temp\\persons\\p.txt","mama");

    }
}
