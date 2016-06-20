package collections;

import files.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Jeka on 20/06/2016.
 */
public class Main1 {
    public static void main(String[] args) {

        //java 7 example
        /*List<String> strings = Arrays.asList("java", "scala", "groovy", "r");
        Collections.sort(strings);
        strings.forEach(System.out::println);
        List<Person> persons = Arrays.asList(new Person());
        Collections.sort(persons);
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        strings.forEach(System.out::println);*/

        List<String> strings = Arrays.asList("java", "scala", "groovy", "r");
        Collections.sort(strings);
        strings.forEach(System.out::println);
        List<Person> persons = Arrays.asList(new Person());
        Collections.sort(persons);
//        Collections.sort(strings, (o1, o2) -> o1.length() - o2.length());
//        Collections.sort(strings, Main1::compareStringsByLength);
        strings.sort(Main1::compareStringsByLength);
        strings.forEach(System.out::println);


    }

    public static int compareStringsByLength(String s1, String s2) {
        return s1.length() - s2.length();
    }
}
