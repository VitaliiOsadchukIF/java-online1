package module11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 0, 4, 5);
        System.out.printf(numbers.stream()
                .sorted()
                .map(i -> i.toString())
                .collect(Collectors.joining(", ")));

    }
}
