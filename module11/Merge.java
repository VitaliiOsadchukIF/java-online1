package module11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge {

    public static void main(String[] args) {
        Stream<String> first = Stream.of("This", "is", "a", "good", "day");
        Stream<String> second = Stream.of("1", "2", "3", "4", "5", "6", "7");

        Stream<String> zipValue = zip(first, second);

        zipValue.peek(System.out::println).collect(Collectors.toList());

    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {

        List<T> result = new ArrayList<>();
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();
        while (iterator1.hasNext() && iterator2.hasNext()) {
            result.add(iterator1.next());
            result.add(iterator2.next());
        }

        Collections.shuffle(result);
        return result.stream();

    }
}
