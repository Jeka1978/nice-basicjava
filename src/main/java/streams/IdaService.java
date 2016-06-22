package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Jeka on 22/06/2016.
 */
public class IdaService {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(new Item(1, "table"), new Item(2, "bed"), new Item(3, "window"));
        List<Color> colors = Arrays.asList(new Color(1, java.awt.Color.BLACK), new Color(2, java.awt.Color.GREEN), new Color(3, java.awt.Color.WHITE));
        Stream.concat(items.stream(),colors.stream()).forEach(System.out::println);
    }
}
