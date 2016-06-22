package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Jeka on 22/06/2016.
 */
public class Riddle {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("1", "2", "3", "4","4"));
        String strToRemove = "4";

       /* Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.equals(strToRemove)) {
                iterator.remove();
            }

        }*/

        List<String> newList = strings.parallelStream().
                filter(str -> !str.equals(strToRemove))
                .collect(Collectors.toList());


        System.out.println(newList);
    }
}
