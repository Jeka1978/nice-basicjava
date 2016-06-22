package streams;

import org.fluttercode.datafactory.impl.DataFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Jeka on 22/06/2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
       /* List<String> list = new ArrayList<>(Arrays.asList("milk", "bread", "tea"));
        Stream<String> stream = list.stream();
        list.add("eggs");
        stream.forEach(System.out::println);*/
        DataFactory dataFactory = new DataFactory();
        Stream.Builder<Object> builder = Stream.builder();
        for (int i = 0; i < 10; i++) {
            builder.add(dataFactory.getCity());
        }
        builder.build().forEach(System.out::println);
        Thread.sleep(100);
    }





}
