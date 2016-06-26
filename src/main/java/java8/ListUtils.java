package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Jeka on 22/06/2016.
 */
public class ListUtils {

    public static <T> void forEachWithDelay(List<T> list, int delay, Consumer<T> consumer) throws InterruptedException {



        list.forEach(t->{
           consumer.accept(t);
           try {
               Thread.sleep(delay);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       });
        /* for (T t : list) {
            consumer.accept(t);
            Thread.sleep(repeat);
        }*/
    }














    public static void main(String[] args) throws InterruptedException {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);
        forEachWithDelay(integers,1000,integer -> System.out.println(integer));
    }
}












